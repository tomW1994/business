package businessactivities;

import businessentities.MarketAnalysisBE;
import dataobjects.MarketAnalysisDO;

public class MarketAnalysisMapperBA {

	public MarketAnalysisDO mapToDO(final MarketAnalysisBE marketAnalysisBE) {
		return new MarketAnalysisDO(
				marketAnalysisBE.getId(),
				marketAnalysisBE.getDepartment(), 
				marketAnalysisBE.getJobname(), 
				marketAnalysisBE.getFocalpoints(),
				marketAnalysisBE.getSalary(),
				marketAnalysisBE.getLocation(),
				marketAnalysisBE.getCustomerphone(),
				marketAnalysisBE.getCustomermail(),
				marketAnalysisBE.getStatus(),
				marketAnalysisBE.getCreated(),
				marketAnalysisBE.getModified()
				);
	}
	
	public MarketAnalysisBE mapToBE(final MarketAnalysisDO marketAnalysisDO) {
		return new MarketAnalysisBE(
				marketAnalysisDO.getDepartment(), 
				marketAnalysisDO.getJobname(), 
				marketAnalysisDO.getFocalpoints(),
				marketAnalysisDO.getSalary(),
				marketAnalysisDO.getLocation(),
				marketAnalysisDO.getCustomerphone(),
				marketAnalysisDO.getCustomermail(),
				marketAnalysisDO.getStatus(),
				marketAnalysisDO.getCreated(),
				marketAnalysisDO.getModified()
				);
	}
	
	public MarketAnalysisBE mapToBeWithId(final MarketAnalysisDO marketAnalysisDO) {
		return new MarketAnalysisBE(
				marketAnalysisDO.getId(), 
				marketAnalysisDO.getDepartment(), 
				marketAnalysisDO.getJobname(), 
				marketAnalysisDO.getFocalpoints(),
				marketAnalysisDO.getSalary(),
				marketAnalysisDO.getLocation(),
				marketAnalysisDO.getCustomerphone(),
				marketAnalysisDO.getCustomermail(),
				marketAnalysisDO.getStatus(),
				marketAnalysisDO.getCreated(),
				marketAnalysisDO.getModified()
				);
	}
}
