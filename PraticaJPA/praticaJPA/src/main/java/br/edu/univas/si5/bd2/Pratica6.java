package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.model.entities.Manager;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica6 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		Manager objManager = new Manager();
		objManager.setRegistry(3);
		objManager.setName("Jane");
		objManager.setStart(new Date());// apenas para teste

		int cityPk = 1;
		City objCity = em.find(City.class, cityPk);

		objCity.setManager(objManager);

		em.getTransaction().begin();
		em.persist(objCity);
		em.persist(objManager);
		em.getTransaction().commit();
	}

}