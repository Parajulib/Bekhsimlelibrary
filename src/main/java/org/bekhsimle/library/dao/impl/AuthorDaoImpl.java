package org.bekhsimle.library.dao.impl;

import java.util.List;

import org.bekhsimle.library.dao.AuthorDao;
import org.bekhsimle.library.domain.Author;
import org.bekhsimle.library.util.ConnectionUtil;
import org.springframework.stereotype.Repository;

/**
 * @author BHARAT
 *
 */
@Repository
public class AuthorDaoImpl extends ConnectionUtil implements AuthorDao {

	public void saveAuthor(Author author) {
		getSession().saveOrUpdate(author);
	}

	public Author getAuthorById(int id) {
		return (Author) getSession().get(Author.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Author> getAllAuthors() {
		return getSession().createQuery("From Author").list();
	}

	public void deleteAuthor(Author author) {
		getSession().delete(author);
	}

	public String searchAuthor(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
