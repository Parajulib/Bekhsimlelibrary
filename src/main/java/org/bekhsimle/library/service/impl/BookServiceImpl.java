package org.bekhsimle.library.service.impl;

import java.util.List;

import org.bekhsimle.library.dao.BookDao;
import org.bekhsimle.library.domain.Book;
import org.bekhsimle.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author BHARAT
 *
 */
@Transactional
@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	BookDao bookDao;
	
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public void saveBook(Book book) {
		bookDao.saveBook(book);
	}

	@Override
	public void deleteBook(int id) {
		Book book = getBookById(id);
		if(book != null)
			bookDao.deleteBook(book);
		
	}

	@Override
	public List<Book> listAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public String searchBook(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
