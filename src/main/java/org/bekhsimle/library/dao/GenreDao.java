package org.bekhsimle.library.dao;

import java.util.List;

import org.bekhsimle.library.domain.Genre;

/**
 * @author BHARAT
 *
 */
public interface GenreDao {
	
	public void saveGenre(Genre genre);
	
	public Genre getGenreById(int id);
	
	public void deleteGenre(Genre genre);
	
	public List<Genre>getAllGenres();
	
	public String searchGenre(String query);

}
