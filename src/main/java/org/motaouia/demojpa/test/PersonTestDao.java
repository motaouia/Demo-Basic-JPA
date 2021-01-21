package org.motaouia.demojpa.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.motaouia.demojpa.models.Person;
import org.motaouia.demojpa.repositories.PersonRepository;
import org.motaouia.demojpa.repositories.PersonRepositoryImpl;

public class PersonTestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonRepository repository = null;
		try {
			Person person = new Person();
			person.setFirstName("Ahmed");
			person.setLasteName("MOTA");
			person.setCreatedDate(LocalDateTime.now());
			person.setDathBirth(LocalDate.of(1993, Month.APRIL, 12));

			repository = new PersonRepositoryImpl();
			// Create person
			repository.create(person);

			person = null;
			// Hibernate creates a person proxy with an increment id of 1
			person = repository.read(1L);

			person.setModifiedDate(LocalDateTime.now());
			person.setFirstName("Jane");
			// Update person record
			repository.update(person);

			person = null;
			// Read updated record
			person = repository.read(1L);

			// Delete person
			repository.delete(person);

			// This will return null
			person = repository.read(1L);
			/**/

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (repository != null)
				((PersonRepositoryImpl) repository).close();
		}

	}

}
