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

import businessfacades.SchoolingBF;
import dataobjects.SchoolingDO;

@Path("schooling")
public class SchoolingResource {
	
	
	private SchoolingBF schoolingBF = new SchoolingBF();
	
    // recieves data object in json format and creates a new DO. 
    // DO get persisted in the database
    @Path("/create")
    @POST
    @Consumes("application/json")
    public SchoolingDO createSchoolingOrder(SchoolingDO schooling) {
    	schooling.setCreated(LocalDateTime.now());
    	 return schoolingBF.createSchooling(schooling);
    }
    
    @Path("/search")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SchoolingDO> searchSchoolings() {
    	return schoolingBF.searchSchoolings();
    }
    
    
    @Path("/update")
    @POST
    @Consumes("application/json")
    public SchoolingDO updateSchooling(SchoolingDO schooling) {
    	schooling.setModified(LocalDateTime.now());
    	return schoolingBF.updateSchooling(schooling);
    }
    
    @Path("/delete")
    @PUT
    public void deleteSchooling(Long id) {
    	schoolingBF.deleteSchooling(id);
    }
}
