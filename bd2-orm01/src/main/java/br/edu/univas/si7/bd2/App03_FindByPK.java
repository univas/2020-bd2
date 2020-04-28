package br.edu.univas.si7.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si7.bd2.entities.Cargo;
import br.edu.univas.si7.bd2.entities.Department;
import br.edu.univas.si7.bd2.utils.HibernateUtil;

public class App03_FindByPK {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		Cargo cargo1 = em.find(Cargo.class, 1);
		System.out.println(cargo1);
		
		Department dep1 = em.find(Department.class, 1);
		System.out.println(dep1);
		
		Department dep13 = em.find(Department.class, 13);
		if(dep13 == null) {
			System.out.println("Não existe departamento com código 13. dep13 is null.");
		} else {
			System.out.println(dep13);
		}
	}
}
