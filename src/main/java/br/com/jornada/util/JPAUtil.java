package br.com.jornada.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JPAUtil {
	private static EntityManagerFactory emf;
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public void close(EntityManager manager) {
		manager.close();
	}
}
