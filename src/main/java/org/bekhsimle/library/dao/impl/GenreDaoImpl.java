package org.bekhsimle.library.dao.impl;

import java.util.List;

import org.bekhsimle.library.dao.GenreDao;
import org.bekhsimle.library.domain.Genre;
import org.bekhsimle.library.util.ConnectionUtil;
import org.springframework.stereotype.Repository;

/**
 * @author BHARAT
 *
 */
@Repository
public class GenreDaoImpl extends ConnectionUtil implements GenreDao {

	public void saveGenre(Genre genre) {
		getSession().saveOrUpdate(genre);
	}

	public Genre getGenreById(int id) {
		return (Genre) getSession().get(Genre.class, id);
	}

	public void deleteGenre(Genre genre) {
		getSession().delete(genre);
	}

	@SuppressWarnings("unchecked")
	public List<Genre> getAllGenres() {
		return getSession().createQuery("FROM Genre").list();
	}

	public String searchGenre(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
