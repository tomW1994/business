package businessactivities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

import businessentities.JobAdmissionBE;

public class JobAdmissionQueryBA {

	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
	final EntityManager em = emf.createEntityManager();
	
	public JobAdmissionBE insertJobAdmission(final JobAdmissionBE jobAdmission) {
    	em.getTransaction().begin();
    	em.persist(jobAdmission);
    	em.getTransaction().commit();
    	em.close();
		return jobAdmission;
	}
	
	public JobAdmissionBE findJobAdmissionById(final Long id) {
		return em.find(JobAdmissionBE.class, id);
	}
	
	public List<JobAdmissionBE> searchJobAdmissions() {
		CriteriaQuery<JobAdmissionBE> criteria = em.getCriteriaBuilder().createQuery(JobAdmissionBE.class);
	    criteria.select(criteria.from(JobAdmissionBE.class));
	    return em.createQuery(criteria).getResultList();
	    }
	
	public void deleteJobAdmission(final Long id) {
		final JobAdmissionBE jobAdmissionToDelete = em.find(JobAdmissionBE.class, id);
		em.getTransaction().begin();
		  em.remove(jobAdmissionToDelete);
		  em.getTransaction().commit();
	}
	
	public JobAdmissionBE updateJobAdmission(final JobAdmissionBE jobAdmissionBE) {
		final JobAdmissionBE jobAdmissionBEToUpdate = em.find(JobAdmissionBE.class, jobAdmissionBE.getId());
		em.getTransaction().begin();
		updateJobAdmissionBE(jobAdmissionBEToUpdate, jobAdmissionBE);
		em.getTransaction().commit();
    	em.close();
		return jobAdmissionBEToUpdate;
	}

	private void updateJobAdmissionBE(final JobAdmissionBE jobAdmissionBEToUpdate, final JobAdmissionBE jobAdmission) {
		jobAdmissionBEToUpdate.setCustomermail(jobAdmission.getCustomermail());
		jobAdmissionBEToUpdate.setStatus(jobAdmission.getStatus());
		jobAdmissionBEToUpdate.setCustomerphone(jobAdmission.getCustomerphone());
		jobAdmissionBEToUpdate.setDepartment(jobAdmission.getDepartment());
		jobAdmissionBEToUpdate.setSalary(jobAdmission.getSalary());
		jobAdmissionBEToUpdate.setFocalpoints(jobAdmission.getFocalpoints());
		jobAdmissionBEToUpdate.setModified(jobAdmission.getModified());
		jobAdmissionBEToUpdate.setStatus(jobAdmission.getStatus());
		jobAdmissionBEToUpdate.setLocation(jobAdmission.getLocation());
		jobAdmissionBEToUpdate.setDepartmentinformation(jobAdmission.getDepartmentinformation());
		jobAdmissionBEToUpdate.setJobinformation(jobAdmission.getJobinformation());
	}
}
