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

import businessfacades.AuthorizationBF;
import businessfacades.JobAdmissionBF;
import dataobjects.CredentialsDO;
import dataobjects.JobAdmissionDO;

@Path("authorization")
public class AuthorizationResource {

private AuthorizationBF authorizationBF = new AuthorizationBF();
	
    // recieves data object in json format and creates a new DO. 
    // DO get persisted in the database
    @Path("/create")
    @POST
    @Consumes("application/json")
    public boolean createAuthorization(CredentialsDO credentials) {
    	return authorizationBF.createAuthorization(credentials);
    }
    
    @Path("/authorize")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public boolean checkCredentials(CredentialsDO credentials) { 
    	return authorizationBF.checkCredentials(credentials);
    }
    
    
    @Path("/update")
    @POST
    @Consumes("application/json")
    public CredentialsDO updateCredentials(CredentialsDO credentials) {
    	return authorizationBF.updateCredentials(credentials);
    }
    
    @Path("/delete")
    @PUT
    public void deleteJobAdmission(Long id) {
    	authorizationBF.deleteCredentials(id);
    }
}
