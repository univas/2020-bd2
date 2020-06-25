package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica41 {

	public static void main(String[] args) {

		// criar um objeto Usuario
		Usuario objUsuario = new Usuario();
		objUsuario.setUsername("jonas");
		objUsuario.setPassword("jonas123");
		objUsuario.setActive(true);
		
		// criar um objeto Funcionario
		Funcionario objFuncionario = new Funcionario();
		objFuncionario.setNome("Jonas");
		objFuncionario.setSexo("M");
		objFuncionario.setNascimento(new Date()); //data de teste

		// setar o usuário dentro do funcionário
		objFuncionario.setUsuario(objUsuario);

		// obter o EntityManager
		EntityManager em = HibernateUtil.getEntityManager();

		// persistir o objeto usuario
		em.getTransaction().begin();
		em.persist(objUsuario);
		em.getTransaction().commit();
		
		// persistir o objeto funcionario
		em.getTransaction().begin();
		em.persist(objFuncionario);
		em.getTransaction().commit();
	}
}
