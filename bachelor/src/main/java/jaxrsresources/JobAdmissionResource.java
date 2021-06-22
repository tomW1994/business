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

import businessfacades.JobAdmissionBF;
import dataobjects.JobAdmissionDO;

@Path("jobadmission")
public class JobAdmissionResource {

private JobAdmissionBF jobAdmissionBF = new JobAdmissionBF();
	
    // recieves data object in json format and creates a new DO. 
    // DO get persisted in the database
    @Path("/create")
    @POST
    @Consumes("application/json")
    public JobAdmissionDO createJobAdmissionOrder(JobAdmissionDO jobAdmission) {
    	jobAdmission.setCreated(LocalDateTime.now()); 
    	return jobAdmissionBF.createJobAdmission(jobAdmission);
    }
    
    @Path("/search")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<JobAdmissionDO> searchJobAdmissions() { 
    	return jobAdmissionBF.searchJobAdmissions();
    }
    
    
    @Path("/update")
    @POST
    @Consumes("application/json")
    public JobAdmissionDO updateJobAdmission(JobAdmissionDO jobAdmission) {
    	jobAdmission.setModified(LocalDateTime.now());
    	return jobAdmissionBF.updateJobAdmission(jobAdmission);
    }
    
    @Path("/delete")
    @PUT
    public void deleteJobAdmission(Long id) {
    	jobAdmissionBF.deleteJobAdmission(id);
    }
}
