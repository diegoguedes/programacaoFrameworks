package br.com.diego.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");

	public EntityManager getEM() {
		return emf.createEntityManager();
	}
}
