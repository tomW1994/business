import javax.ws.rs.GET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.json.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class Resource {
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHello() {
			createStudent();
    	return getNameOfDb();
    }
    
    private static void createStudent() {
    	Student student = new Student();
    	student.setName("Elena");
    	student.setId(3L);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	em.persist(student);
    	em.getTransaction().commit();
    	em.close();
    }
    
    private String getNameOfDb() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em = emf.createEntityManager();
    	Student a = em.find(Student.class, 1L);
    	return a.getName();
    }
}