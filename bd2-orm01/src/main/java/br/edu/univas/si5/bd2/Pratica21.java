package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica21 {

	public static void main(String[] args) {
		
		//cria um objeto de teste
		Cargo programador = new Cargo();
		programador.setCodigo(3);
		programador.setNome("Gerente");
		programador.setSalario(3000f);
		
		//obter uma instância do EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		//persistir o objeto (dentro de uma transação)
		em.getTransaction().begin();//inicia a transação
		em.persist(programador);
		em.getTransaction().commit();//finaliza a transação
	}
}
