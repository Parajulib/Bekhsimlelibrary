package org.bekhsimle.library.service.impl;

import java.util.List;

import org.bekhsimle.library.dao.GenreDao;
import org.bekhsimle.library.domain.Genre;
import org.bekhsimle.library.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author BHARAT
 *
 */
@Transactional
@Service
public class GenreServiceImpl implements GenreService {


	@Autowired
	GenreDao genreDao;
	
	public void saveGenre(Genre genre) {
		genreDao.saveGenre(genre);
	}


	public Genre getGenreById(int id) {
		return genreDao.getGenreById(id);
	}

	public List<Genre> getAllGenres() {
		return genreDao.getAllGenres();
	}

	public void deleteGenre(int id) {
		Genre genre = getGenreById(id);
		if(genre != null)
		genreDao.deleteGenre(genre);
	}

	@Override
	public String searchGenre(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
