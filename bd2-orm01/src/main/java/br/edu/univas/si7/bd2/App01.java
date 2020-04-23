package br.edu.univas.si7.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si7.bd2.entities.Cargo;
import br.edu.univas.si7.bd2.utils.HibernateUtil;

public class App01 {
	public static void main(String[] args) {

		System.out.println("First Hibernate code...");
		
//		Cargo operador = new Cargo(1, "Operador"); //aloca um objeto
//		Cargo supervisor = new Cargo(2, "Supervisor"); //aloca um objeto
//		Cargo gerente = new Cargo(3, "Gerente"); //aloca um objeto
//		Cargo lider = new Cargo(12, "Líder 8"); //aloca um objeto
//		Cargo lider = new Cargo(13, null); //aloca um objeto - teste do nullable
//		Cargo lider = new Cargo(13, "Gerente de Atendimento de Fornecedor do Exterior"); //validação de comprimento da string
//		Cargo lider = new Cargo(null, "Gerente de Atendimento de Fornecedor do Exterior"); //
		Cargo lider = new Cargo(13, "Líder 9"); //aloca um objeto

		EntityManager em = HibernateUtil.getEntityManager(); //obtém uma instância do EntityManager
		
		em.getTransaction().begin();
		System.out.println("Iniciou a transação.");
		em.persist(lider); //deve ser feita dentro de uma transação
		System.out.println("Vai fazer o commit.");
		em.getTransaction().commit();
		
		System.out.println("Finalizou a persistência do objeto: " + lider);
	}
}
