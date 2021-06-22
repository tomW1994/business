package businessactivities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

import businessentities.MarketAnalysisBE;

public class MarketAnalysisQueryBA {

	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
	final EntityManager em = emf.createEntityManager();
	
	public MarketAnalysisBE insertMarketAnalysis(final MarketAnalysisBE marketAnalysis) {
	 	em.getTransaction().begin();
    	em.persist(marketAnalysis);
    	em.getTransaction().commit();
    	em.close();
		return marketAnalysis;
	}
	
	public MarketAnalysisBE findMarketAnalysisById(final Long id) {
		return em.find(MarketAnalysisBE.class, id);
	}
	
	public List<MarketAnalysisBE> searchMarketAnalysis() {
		CriteriaQuery<MarketAnalysisBE> criteria = em.getCriteriaBuilder().createQuery(MarketAnalysisBE.class);
	    criteria.select(criteria.from(MarketAnalysisBE.class));
	    return em.createQuery(criteria).getResultList();
	}
	
	public void deleteMarketAnalysis(final Long id) {
		final MarketAnalysisBE marketAnalysisToDelete = em.find(MarketAnalysisBE.class, id);
		em.getTransaction().begin();
		  em.remove(marketAnalysisToDelete);
		  em.getTransaction().commit();
	}
	
	public MarketAnalysisBE updateMarketAnalysis(final MarketAnalysisBE marketAnalysisBE) {
		final MarketAnalysisBE marketAnalysisBEToUpdate = em.find(MarketAnalysisBE.class, marketAnalysisBE.getId());
		em.getTransaction().begin();
		updateMarketAnalysisBE(marketAnalysisBEToUpdate, marketAnalysisBE);
		em.getTransaction().commit();
    	em.close();
		return marketAnalysisBEToUpdate;
	}

	private void updateMarketAnalysisBE(final MarketAnalysisBE marketAnalysisBEToUpdate, final MarketAnalysisBE marketAnalysis) {
		marketAnalysisBEToUpdate.setCustomermail(marketAnalysis.getCustomermail());
		marketAnalysisBEToUpdate.setStatus(marketAnalysis.getStatus());
		marketAnalysisBEToUpdate.setCustomerphone(marketAnalysis.getCustomerphone());
		marketAnalysisBEToUpdate.setDepartment(marketAnalysis.getDepartment());
		marketAnalysisBEToUpdate.setSalary(marketAnalysis.getSalary());
		marketAnalysisBEToUpdate.setFocalpoints(marketAnalysis.getFocalpoints());
		marketAnalysisBEToUpdate.setModified(marketAnalysis.getModified());
		marketAnalysisBEToUpdate.setStatus(marketAnalysis.getStatus());
		marketAnalysisBEToUpdate.setLocation(marketAnalysis.getLocation());
	}
}
