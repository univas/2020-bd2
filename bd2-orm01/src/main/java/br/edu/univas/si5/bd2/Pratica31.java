package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Department;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica31 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		Cargo objCargo = em.find(Cargo.class, 2); // busca cargo com pk 2
		System.out.println("Cargo: " + objCargo);

		Department objDep = em.find(Department.class, 5);// busca dep com pk 5
		System.out.println("Departamento: " + objDep);

		Funcionario objFun = em.find(Funcionario.class, 19);// busca func com pk 19
		if (objFun == null) {
			System.out.println("Não há funcionário com código 19. objFun is null.");
		} else {
			System.out.println("Funcionario: " + objFun);
		}
	}
}
