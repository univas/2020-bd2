package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.Manager;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica2 {

	public static void main(String[] args) {
		// Instanciar um objeto Gestor.
		Manager objManager = new Manager();
		objManager.setRegistry(1);
		objManager.setName("João");
		objManager.setStart(new Date());// data de hoje, apenas para teste

		// obter o entityManager, fornecido pela classe HibernateUtil.
		EntityManager em = HibernateUtil.getEntityManager();

		// Persistir o objeto dentro de uma transação.
		em.getTransaction().begin();
		em.persist(objManager); // persiste o objeto no banco de dados
		em.getTransaction().commit();
	}

}
