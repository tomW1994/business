package businessactivities;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import businessentities.CredentialsBE;
import dataobjects.CredentialsDO;

public class AuthorizationQueryBA {

	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
	final EntityManager em = emf.createEntityManager();

	public boolean insertCredentials(final CredentialsBE credentials) {
		if (em.createQuery("SELECT c from credentials c where c.id.username = :username")
				.setParameter("username", credentials.getUsername()).getMaxResults() == 0) {
			em.getTransaction().begin();
			em.persist(credentials);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		return false;
	}

	public int checkCredentials(final CredentialsDO credentials) {
		return em
				.createQuery(
						"SELECT c from credentials c where c.id.username = :username and c.id.password = :password")
				.setParameter("username", credentials.getUsername()).setParameter("password", credentials.getPassword())
				.getMaxResults();
	}

}
