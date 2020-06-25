package br.edu.univas.si5.bd2;

import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica53 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		// buscar o cargo
		int cargoPk = 3;
		Cargo objCargo = em.find(Cargo.class, cargoPk);
		
		//imprimir o cargo
		System.out.println(objCargo);
		
		//obter os funcionários daquele cargo
		Set<Funcionario> objsFun = objCargo.getFuncionarios();
		
		//imprimir os funcionários
		for (Funcionario fun : objsFun) {
			System.out.println(fun);
		}
	}
}
