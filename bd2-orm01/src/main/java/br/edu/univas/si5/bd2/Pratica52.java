package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica52 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		// buscar o funcionário - usar find
		
		//testar com fetch default
		//testar com fetch LAZY
		int funPk = 23;
		Funcionario objFun = em.find(Funcionario.class, funPk);

		//imprimir o funcionário
		System.out.println(objFun);
		
		//obter/buscar o cargo deste funcionário
		Cargo objCargo = objFun.getCargo();
		
		//imprimir o cargo
		System.out.println(objCargo);
	}

}
