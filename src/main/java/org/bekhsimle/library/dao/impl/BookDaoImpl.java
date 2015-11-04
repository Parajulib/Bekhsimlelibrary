package org.bekhsimle.library.dao.impl;

import java.util.List;

import org.bekhsimle.library.dao.BookDao;
import org.bekhsimle.library.domain.Book;
import org.bekhsimle.library.util.ConnectionUtil;
import org.springframework.stereotype.Repository;

/**
 * @author BHARAT
 *
 */
@Repository
public class BookDaoImpl extends ConnectionUtil implements BookDao {

	public void saveBook(Book book) {
		getSession().saveOrUpdate(book);
	}

	public Book getBookById(int id) {
		return (Book) getSession().get(Book.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Book> getAllBooks() {
		return getSession().createQuery("FROM Book").list();
	}

	public void deleteBook(Book book) {
		getSession().delete(book);
	}

	public String searchBook(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
