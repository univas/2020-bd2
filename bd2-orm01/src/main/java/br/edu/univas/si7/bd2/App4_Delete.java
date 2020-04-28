package br.edu.univas.si7.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si7.bd2.entities.Department;
import br.edu.univas.si7.bd2.utils.HibernateUtil;

public class App4_Delete {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		int idToRemove = 7;
		
		Department departamentoDetaced = new Department(); //não permite remover entity detached
		departamentoDetaced.setCode(idToRemove); //não permite remover entity detached
		
		//obter um objeto gerenciado (attached)
		Department departamento = em.find(Department.class, idToRemove);//agora a variável departamento está gerenciada (attaced)
		
		em.getTransaction().begin();
		//precisa estar dentro de uma transação
		em.remove(departamento); //o objeto a ser removido precisa ser gerenciado pelo EntityManager
		em.getTransaction().commit();
	}

}
