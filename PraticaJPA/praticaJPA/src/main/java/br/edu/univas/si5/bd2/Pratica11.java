package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.model.entities.Manager;
import br.edu.univas.si5.bd2.model.entities.State;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica11 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();


		int cityPk = 4;
		City objCity = em.find(City.class, cityPk);
		System.out.println(objCity);

		State objState = objCity.getState();
		System.out.println(objState);
		
		Manager objManager = objCity.getManager();
		System.out.println(objManager);
	}
}