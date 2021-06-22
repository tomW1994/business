/*import javax.ws.rs.GET;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*@Path("test")
public class StudentResource {
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHello() {
		// createStudent();
    	/**StudentBE student = new StudentBE();
    	student.setId(32L);
    	student.setName("Fett");
    	student.setAlter(13);
    	student.setVorname("Dick");
    	 */
 /*   	ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(createStudent());
            System.out.println("ResultingJSONstring = " + json);
            return json;
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
}
    	return null;
    }
   */ 
    // find a student with id from the requestbody
/*    @Path("/find")
    @POST
    public StudentBE find(Long id) {
    	/**      ObjectMapper mapper = new ObjectMapper();
       try {
        	
            String json = mapper.writeValueAsString(getNameOfDb(id));
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
}*/
   /* 	return getNameOfDb(id);
    }
    
    // recieves data object in json format and creates a new DO. 
    // DO get persisted in the database
    @Path("/maptodo")
    @POST
    public String handle3(StudentBE student) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	em.persist(student);
    	em.getTransaction().commit();
    	em.close();
        return "läuft";
    }
    
    
    private StudentBE createStudent() {
    	StudentBE student = new StudentBE();
    	student.setName("Elena");
    	student.setAlter(13);
    	student.setVorname("El");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	em.persist(student);
    	em.getTransaction().commit();
    	em.close();
    	return student;
    }
    
    private StudentBE getNameOfDb(Long id) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em = emf.createEntityManager();
    	StudentBE a = em.find(StudentBE.class, id);
    	return a;
    }
}*/