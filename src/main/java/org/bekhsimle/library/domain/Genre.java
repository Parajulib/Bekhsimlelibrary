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
public class Genre {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String genreName;
	
	@ManyToMany(mappedBy="genre")
	private List<Book> book = new ArrayList<Book>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
	

}
