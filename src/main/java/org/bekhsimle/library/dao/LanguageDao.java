package org.bekhsimle.library.dao;

import java.util.List;

import org.bekhsimle.library.domain.Language;

/**
 * @author BHARAT
 *
 */
public interface LanguageDao {
	
	public void saveLanguage(Language language);
	
	
	public Language getLanguageById(int id);
	
	
	public List<Language>getAllLanguages();
	
	
	public String searchLanguage(String query);
	
	
	public void deleteLanguage(Language language);
	

}
