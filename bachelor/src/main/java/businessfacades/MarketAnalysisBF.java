package businessfacades;

import java.util.List;
import java.util.stream.Collectors;

import businessactivities.MarketAnalysisMapperBA;
import businessactivities.MarketAnalysisQueryBA;
import businessentities.MarketAnalysisBE;
import dataobjects.MarketAnalysisDO;

public class MarketAnalysisBF {

	final MarketAnalysisMapperBA marketAnalysisMapperBA = new MarketAnalysisMapperBA();

	final MarketAnalysisQueryBA marketAnalysisQueryBA = new MarketAnalysisQueryBA();

	/**
	 * maps the market analysis data transfer object to a business entity and inserts it
	 * in the database
	 */
	public MarketAnalysisDO createMarketAnalysis(final MarketAnalysisDO marketAnalysisDO) {
		final MarketAnalysisBE marketAnalysisBE = marketAnalysisMapperBA.mapToBE(marketAnalysisDO);
		return marketAnalysisMapperBA.mapToDO(marketAnalysisQueryBA.insertMarketAnalysis(marketAnalysisBE));
	}

	/*
	 * /** takes the id of the market analysis do and removes it in the database
	 */
	public void deleteMarketAnalysis(final Long id) {
		// find market analysis do change market analysis do  save market analysis do 
		marketAnalysisQueryBA.deleteMarketAnalysis(id);
	}

	/**
	 * returns all market analysis entries in the database
	 */
	public List<MarketAnalysisDO> searchMarketAnalysis() {
		// return all entries of MarketAnalysisTable
		List<MarketAnalysisBE> beList = marketAnalysisQueryBA.searchMarketAnalysis();
		return beList.stream().map(be -> marketAnalysisMapperBA.mapToDO(be)).collect(Collectors.toList());
	}

	/**
	 * updates the market analysis entity
	 */
	public MarketAnalysisDO updateMarketAnalysis(final MarketAnalysisDO marketAnalysisDoToUpdate) {
	// find marketAnalysisdo update marketAnalysisdo save marketAnalysisdo
		final MarketAnalysisBE marketAnalysisBeToUpdate = marketAnalysisMapperBA.mapToBeWithId(marketAnalysisDoToUpdate);
		final MarketAnalysisBE marketAnalysisBE = marketAnalysisQueryBA.updateMarketAnalysis(marketAnalysisBeToUpdate);
		return marketAnalysisMapperBA.mapToDO(marketAnalysisBE);
	}

}
