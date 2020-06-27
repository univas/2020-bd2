package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.model.entities.Manager;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica5 {
	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		Manager objManager = new Manager();
		objManager.setRegistry(2);
		objManager.setName("Jonas");
		objManager.setStart(new Date());// apenas para teste

		City objCity = new City(); // o IBGE será gerado pela sequence
		objCity.setName("Cachoeira de Minas");
//		objCity.setState("MG");
		objCity.setArea(234); // valor de teste

		objCity.setManager(objManager);

		em.getTransaction().begin();
		em.persist(objManager);
		em.persist(objCity);
		em.getTransaction().commit();
	}
}