package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica27 {

	public static void main(String[] args) {
		// criar um objeto
		Funcionario objFuncionario = new Funcionario();
		// não precisa setar o registro pois ele será gerado automaticamente pela
		// sequence
		objFuncionario.setNome("Jeane");
		objFuncionario.setSexo("F");
		objFuncionario.setNascimento(new Date()); //exemplo didático: seta com a data de hoje

		// obter o EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();

		// persistir o objeto
		em.getTransaction().begin();
		em.persist(objFuncionario);
		em.getTransaction().commit();

		// verificar o valor gerado pela sequence
		System.out.println("Valor gerado pelo insert na tabela FUNCIONARIO: " + objFuncionario.getRegistro());
	}
}
