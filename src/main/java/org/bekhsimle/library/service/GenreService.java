package org.bekhsimle.library.service;

import java.util.List;

import org.bekhsimle.library.domain.Genre;

/**
 * @author BHARAT
 *
 */
public interface GenreService {
	
	public void saveGenre(Genre genre);
	
	public Genre getGenreById(int id);
	
	public List<Genre>getAllGenres();
	
	public void deleteGenre(int id);
	
	public String searchGenre(String query);
	
	

}
