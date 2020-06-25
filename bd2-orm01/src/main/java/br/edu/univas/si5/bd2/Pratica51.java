package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica51 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		//buscar o cargo
		int cargoPk = 2;//analista
		Cargo objCargo = em.find(Cargo.class, cargoPk);
		
		//(v)criar um objeto usuário / ou buscar um usuário existente
		Usuario objUsuario = new Usuario();
		objUsuario.setUsername("jorge");
		objUsuario.setPassword("jorge123");
		objUsuario.setActive(true);
		
		//criar um objeto funcionário
		Funcionario objFuncionario = new Funcionario();
		objFuncionario.setNome("Jorge");
		objFuncionario.setSexo("M");
		objFuncionario.setNascimento(new Date()); //data de teste
		
		//setar o usuário dentro do funcionário
		objFuncionario.setUsuario(objUsuario);
		
		//setar o cargo dentro do funcionário
		objFuncionario.setCargo(objCargo);
		
		em.getTransaction().begin();
			//persistir o usuário
			em.persist(objUsuario);
			//persistir o funcionario
			em.persist(objFuncionario);
		em.getTransaction().commit();
	}

}
