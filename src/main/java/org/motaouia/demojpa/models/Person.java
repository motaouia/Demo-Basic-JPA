package org.motaouia.demojpa.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lasteName;
	private String firstName;
	private LocalDate dathBirth;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;

	public Person() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLasteName() {
		return lasteName;
	}

	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getDathBirth() {
		return dathBirth;
	}

	public void setDathBirth(LocalDate dathBirth) {
		this.dathBirth = dathBirth;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
