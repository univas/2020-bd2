package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.model.entities.City;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class Pratica4 {

	public static void main(String[] args) {
		// obter o EntityManager
		EntityManager em = HibernateUtil.getEntityManager();

		// buscar um objeto city pela PK
		int cityPK = 1;
		City objCity = em.find(City.class, cityPK);

		// se existe o objeto
		if (objCity != null) {
			// modificar algum valor do objeto
			objCity.setName("Santa Rita do Sapucaí");
			objCity.setArea(234);

			// fazer update no banco de dados com os novos valores
			em.getTransaction().begin();
			em.merge(objCity);
			em.getTransaction().commit();

		} else {
			System.out.println("Objeto City com PK " + cityPK + " não existe.");
		}
	}
}
