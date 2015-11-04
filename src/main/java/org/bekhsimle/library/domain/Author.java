package org.bekhsimle.library.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author BHARAT
 *
 */
@Entity
public class Author {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	
	@ManyToMany(mappedBy="authors")
	private List<Book> book= new ArrayList<Book>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
