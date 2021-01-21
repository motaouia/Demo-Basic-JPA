package org.motaouia.demojpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.motaouia.demojpa.models.Person;

public class PersonRepositoryImpl implements PersonRepository {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
	private EntityManager em;

	public PersonRepositoryImpl() {
		em = emf.createEntityManager();
	}

	public Person create(Person person) {
		em.getTransaction().begin();
		em.persist(person);
	    em.getTransaction().commit();
	    return person;
	}

	public Person read(Long id) {
		em.getTransaction().begin();
	    Person person = em.find(Person.class, id);
	    em.getTransaction().commit();
	    return person;
	}

	public Person update(Person person) {
		em.getTransaction().begin();
	    person = em.merge(person);
	    em.getTransaction().commit();
	    return person;
	}

	public void delete(Person person) {
		 em.getTransaction().begin();
		 em.remove(person);
		 em.getTransaction().commit();

	}

	public void close() {
		emf.close();
	}

}