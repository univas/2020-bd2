package br.edu.univas.si7.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si7.bd2.entities.Cargo;
import br.edu.univas.si7.bd2.utils.HibernateUtil;

public class App01 {
	public static void main(String[] args) {

		System.out.println("First Hibernate code...");
		
//		Cargo operador = new Cargo(1, "Operador"); //aloca um objeto
		Cargo operador = new Cargo(2, "Supervisor"); //aloca um objeto

		EntityManager em = HibernateUtil.getEntityManager(); //obtém uma instância do EntityManager
		
		em.getTransaction().begin();
		em.persist(operador); //deve ser feita dentro de uma transação
		em.getTransaction().commit();
		
		System.out.println("Finalizou a persistência do objeto: " + operador);
	}
}
