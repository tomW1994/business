package businessactivities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

import businessentities.SchoolingBE;

public class SchoolingQueryBA {

	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
	final EntityManager em = emf.createEntityManager();

	public SchoolingBE insertSchooling(final SchoolingBE schooling) {
		em.getTransaction().begin();
		em.persist(schooling);
		em.getTransaction().commit();
		em.close();
		return schooling;
	}

	public SchoolingBE findSchoolingById(final Long id) {
		return em.find(SchoolingBE.class, id);
	}

	public List<SchoolingBE> searchSchoolings() {
		CriteriaQuery<SchoolingBE> criteria = em.getCriteriaBuilder().createQuery(SchoolingBE.class);
		criteria.select(criteria.from(SchoolingBE.class));
		return em.createQuery(criteria).getResultList();
	}

	public void deleteSchooling(final Long id) {
		final SchoolingBE schoolingToDelete = em.find(SchoolingBE.class, id);
		em.getTransaction().begin();
		em.remove(schoolingToDelete);
		em.getTransaction().commit();
	}

	public SchoolingBE updateSchooling(final SchoolingBE schoolingBE) {
		final SchoolingBE schoolingBEToUpdate = em.find(SchoolingBE.class, schoolingBE.getId());
		em.getTransaction().begin();
		updateSchoolingBE(schoolingBEToUpdate, schoolingBE);
		em.getTransaction().commit();
    	em.close();
		return schoolingBEToUpdate;
	}

	private void updateSchoolingBE(final SchoolingBE schoolingBEToUpdate, final SchoolingBE schooling) {
		schoolingBEToUpdate.setCustomermail(schooling.getCustomermail());
		schoolingBEToUpdate.setStatus(schooling.getStatus());
		schoolingBEToUpdate.setCustomerphone(schooling.getCustomerphone());
		schoolingBEToUpdate.setDepartmentId(schooling.getDepartment());
		schoolingBEToUpdate.setSchoolingName(schooling.getSchoolingName());
		schoolingBEToUpdate.setGroupSize(schooling.getGroupSize());
		schoolingBEToUpdate.setModified(schooling.getModified());
	}

}
