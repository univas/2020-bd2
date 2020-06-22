package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica3 {

	public static void main(String[] args) {
		
		//criar um objeto City
		City objCity = new City();
		//não precisa setar o IBGE, porque ele será gerado pela sequence
		objCity.setName("Pouso Alegre");
		objCity.setState("MG");
		objCity.setArea(123); //valor qualquer de teste
		
		//obter o EntityManager
		EntityManager em = HibernateUtil.getEntityManager();
		
		//persistir o objeto City
		em.getTransaction().begin();
		em.persist(objCity);
		em.getTransaction().commit();
		
		//imprimir o valor do IBGE gerado na inserção do objeto no banco
		System.out.println("IBGE do objCity armazenado: " + objCity.getIbge());
	}
}
