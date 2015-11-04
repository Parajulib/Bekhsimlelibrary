package org.bekhsimle.library.dao;

import java.util.List;

import org.bekhsimle.library.domain.Author;

/**
 * @author BHARAT
 *
 */
public interface AuthorDao {
	
	
	public void saveAuthor(Author author);
	
	public Author getAuthorById(int id);
	
	public List<Author>getAllAuthors();
	
	public void deleteAuthor(Author author);
	
	public String searchAuthor(String query);
	
	
	

}
