package jaxrsresources;

import java.time.LocalDateTime;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import businessfacades.MarketAnalysisBF;
import dataobjects.MarketAnalysisDO;

@Path("marketanalysis")
public class MarketAnalysisResource {
	
private MarketAnalysisBF marketAnalysisBF = new MarketAnalysisBF();
	
    // recieves data object in json format and creates a new DO. 
    // DO get persisted in the database
    @Path("/create")
    @POST
    @Consumes("application/json")
    public MarketAnalysisDO createMarketAnalysisOrder(MarketAnalysisDO marketAnalysis) {
    	marketAnalysis.setCreated(LocalDateTime.now()); 
    	return marketAnalysisBF.createMarketAnalysis(marketAnalysis);
    }
    
    @Path("/search")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MarketAnalysisDO> searchMarketAnalysis() {
    	return marketAnalysisBF.searchMarketAnalysis();
    }
    
    
    @Path("/update")
    @POST
    @Consumes("application/json")
    public MarketAnalysisDO updateMarketAnalysis(MarketAnalysisDO marketAnalysis) {
    	marketAnalysis.setModified(LocalDateTime.now());
    	return marketAnalysisBF.updateMarketAnalysis(marketAnalysis);
    }
    
    @Path("/delete")
    @PUT
    public void deleteMarketAnalysis(Long id) {
    	marketAnalysisBF.deleteMarketAnalysis(id);
    }
}
