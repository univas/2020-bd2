package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica26 {

	public static void main(String[] args) {
		// criar um objeto
		Funcionario joao = new Funcionario();
		// não precisa setar o registro pois ele será gerado automaticamente pela
		// sequence
		joao.setNome("João");
		joao.setSexo("M");

		// obter o EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();

		// persistir o objeto
		em.getTransaction().begin();
		em.persist(joao);
		em.getTransaction().commit();

		// verificar o valor gerado pela sequence
		System.out.println("Valor gerado pelo insert na tabela FUNCIONARIO: " + joao.getRegistro());
	}
}
