package org.bekhsimle.library.service.impl;

import java.util.List;

import org.bekhsimle.library.dao.AuthorDao;
import org.bekhsimle.library.domain.Author;
import org.bekhsimle.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author BHARAT
 *
 */
@Transactional
@Service
public class AuthorServiceImpl implements AuthorService {

	
	@Autowired
	AuthorDao authorDao;
	
	public Author getAuthorById(int id) {
		return authorDao.getAuthorById(id);
		
	}

	@Override
	public void saveAuthor(Author author) {
		authorDao.saveAuthor(author);
	}

	@Override
	public void deleteAuthor(int id) {
		Author author = getAuthorById(id);
		if(author != null)
		authorDao.deleteAuthor(author);
	}

	@Override
	public List<Author> listAllAuthors() {
		return authorDao.getAllAuthors();
	}

	public String searchAuthor(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
