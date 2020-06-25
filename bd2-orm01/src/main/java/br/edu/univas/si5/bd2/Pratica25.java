package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Department;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica25 {

	public static void main(String[] args) {

		//Criar um objeto de teste
		Department compras = new Department();
		compras.setName("Compras");
		
		//obter uma instância do EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		//persistir o objeto (dentro de uma transação), com auto-incremento
		em.getTransaction().begin();
		em.persist(compras);
		em.getTransaction().commit();
		
		//verificar o valor gerado automaticamente
		System.out.println("Valor gerado pelo insert na tabela DEPARTMENT: " + compras.getCode());
	}
}
