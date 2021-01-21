package org.motaouia.demojpa.repositories;

import org.motaouia.demojpa.models.Person;

public interface PersonRepository {
	
	 public Person create(Person person);
	 public Person read(Long id);
	 public Person update(Person person);
	 public void delete(Person person);

}
