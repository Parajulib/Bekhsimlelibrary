package org.bekhsimle.library.service;

import java.util.List;

import org.bekhsimle.library.domain.Book;

/**
 * @author BHARAT
 *
 */
public interface BookService {
	
	public Book getBookById(int id);
	
	public void saveBook(Book book);

	public void deleteBook(int id);

	public List<Book> listAllBooks();
	
	public String searchBook(String query);

}
