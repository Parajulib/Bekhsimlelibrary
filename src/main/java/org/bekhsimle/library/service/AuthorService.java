package org.bekhsimle.library.service;

import java.util.List;

import org.bekhsimle.library.domain.Author;

/**
 * @author BHARAT
 *
 */
public interface AuthorService {
	
	public Author getAuthorById(int id);
	
	public void saveAuthor(Author author);

	public void deleteAuthor(int id);

	public List<Author> listAllAuthors();
	
	public String searchAuthor(String query);

	
	

}
