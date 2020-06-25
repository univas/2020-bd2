package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica42 {

	public static void main(String[] args) {
		//implementar o toString de Usuario e 
		//atualizar o toString do Funcionario (por enquanto não)
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		String userPK = "joao";
		//buscar um usuário
		Usuario objUser = em.find(Usuario.class, userPK);
		
		//imprime o usuário
		System.out.println("Usuário com a PK " + userPK + ": " + objUser);
		
		//buscar um funcionario do usuário consultado anteriormente
		//não precisamos mais fazer o find
		//usa o método getFuncionario() da classe Usuário para pegar o objeto funcionário dele.
		//o @OneToOne permite obter um objeto correspondente que referente ao outro lado do relacionamento
		Funcionario objFun = objUser.getFuncionario();
		
		//imprime o funcionario
		System.out.println("Funcionário do usuário " + userPK + ": " + objFun);
	}
}
