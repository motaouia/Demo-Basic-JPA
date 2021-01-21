package org.motaouia.demojpa.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmployee;
	private String nameEmployee;

	public Employee() {
		super();
	}

	public Employee(String nameEmployee) {
		super();
		this.nameEmployee = nameEmployee;
	}

	public Long getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", nameEmployee=" + nameEmployee + "]";
	}

}
