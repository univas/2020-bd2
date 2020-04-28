package br.edu.univas.si7.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si7.bd2.entities.Cargo;
import br.edu.univas.si7.bd2.utils.HibernateUtil;

public class App05_Update {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		int cargoToUpdate = 8;
		
		//obtém o objeto gerenciado
		Cargo cargo8 = em.find(Cargo.class, cargoToUpdate);
		
		//modifica o objeto
		cargo8.setNome("Programador");
		
		//faz update do objeto no banco
		em.getTransaction().begin();
		em.merge(cargo8);
		em.getTransaction().commit();
	}

}
