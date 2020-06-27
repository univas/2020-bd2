package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.model.entities.Manager;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica7 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		int cityPk = 3;
		City objCity = em.find(City.class, cityPk);
		
		Manager objManager = objCity.getManager();
		
		em.getTransaction().begin();
		em.remove(objManager);
		em.remove(objCity);
		em.getTransaction().commit();
	}
}