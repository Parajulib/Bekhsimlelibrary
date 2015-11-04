package org.bekhsimle.library.dao;

import java.util.List;

import org.bekhsimle.library.domain.Book;

/**
 * @author BHARAT
 *
 */
public interface BookDao {
	
	public void saveBook(Book book);
	
	public Book getBookById(int id);
	
	public List<Book>getAllBooks();
	
	public void deleteBook(Book book);
	
	public String searchBook(String query);
	
	
	
}
