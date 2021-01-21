package org.motaouia.demojpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.motaouia.demojpa.models.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManagerFactory.getProperties().replace("hibernate.show_sql", true, false);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Starting Transaction");
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		employee.setNameEmployee("Med MOTA");
		System.out.println("Saving Employee to Database");

		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		System.out.println("Generated Employee ID = " + employee.getIdEmployee());

		// get an object using primary key.
		Employee emp = entityManager.find(Employee.class, employee.getIdEmployee());
		System.out.println("got object " + emp.getNameEmployee() + " " + emp.getIdEmployee());

		// get all the objects from Employee table
		@SuppressWarnings("unchecked")
		List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();

		if (listEmployee == null) {
			System.out.println("No employee found . ");
		} else {
			for (Employee empl : listEmployee) {
				System.out.println("Employee name= " + empl.getNameEmployee() + ", Employee id " + empl.getIdEmployee());
			}
		}
		// remove and entity
		/*entityManager.getTransaction().begin();
		System.out.println("Deleting Employee with ID = " + emp.getIdEmployee());
		entityManager.remove(emp);
		entityManager.getTransaction().commit();
		*/

		// close the entity manager
		entityManager.close();
		entityManagerFactory.close();


	}

}
