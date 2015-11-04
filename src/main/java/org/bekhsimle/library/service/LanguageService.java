package org.bekhsimle.library.service;

import java.util.List;

import org.bekhsimle.library.domain.Language;

/**
 * @author BHARAT
 *
 */
public interface LanguageService {

	public void saveLanguage(Language language);
	
	public Language getLanguageById(int id);
	
	public List<Language>getAllLanguages();
	
	public void deleteLanguage(int id);
	
	public String searchLanguage(String query);
	
	
	
}
