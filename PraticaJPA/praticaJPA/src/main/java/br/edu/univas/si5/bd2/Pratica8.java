package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.State;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica8 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		State objState1 = new State();
		objState1.setIbgeUF(1234);
		objState1.setName("Minas Gerais");
		objState1.setInitials("MG");

		State objState2 = new State();
		objState2.setIbgeUF(2345);
		objState2.setName("São Paulo");
		objState2.setInitials("SP");

		em.getTransaction().begin();
		em.persist(objState1);
		em.persist(objState2);
		em.getTransaction().commit();
	}
}