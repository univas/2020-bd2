package br.edu.univas.si7.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si7.bd2.entities.Department;
import br.edu.univas.si7.bd2.utils.HibernateUtil;

public class App02_InsertSequence {
	public static void main(String[] args) {

		System.out.println("First Hibernate code...");

		Department vendas = new Department();
		vendas.setName("Vendas");

		EntityManager em = HibernateUtil.getEntityManager(); //obtém uma instância do EntityManager
		
		em.getTransaction().begin();
		System.out.println("Iniciou a transação.");
		em.persist(vendas); //deve ser feita dentro de uma transação
		System.out.println("Vai fazer o commit.");
		em.getTransaction().commit();
		
		System.out.println("Finalizou a persistência do objeto: " + vendas);
	}
}
