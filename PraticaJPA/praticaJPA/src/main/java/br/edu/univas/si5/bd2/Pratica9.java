package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.model.entities.State;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica9 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		int estadoPK = 1234;
		State objState = em.find(State.class, estadoPK);

		City objCity1 = new City(); //o IBGE é gerado pela sequence
		objCity1.setName("Cachoeira de Minas");
		objCity1.setArea(345); //valor qualquer de teste

		City objCity2 = new City(); //o IBGE é gerado pela sequence
		objCity2.setName("Santa Rita do Sapucaí");
		objCity2.setArea(456); //valor qualquer de teste
		
		objCity1.setState(objState);
		objCity2.setState(objState);
		
		em.getTransaction().begin();
		em.persist(objCity1);
		em.persist(objCity2);
		em.getTransaction().commit();
	}
}