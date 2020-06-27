package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.model.entities.State;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica10 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		int estadoPK = 2345; // SP
		State objState = em.find(State.class, estadoPK);

		int cityPk = 7890; // São Bento
		City objCity = em.find(City.class, cityPk);

		objCity.setState(objState);

		em.getTransaction().begin();
		em.persist(objCity);
		em.getTransaction().commit();
	}
}