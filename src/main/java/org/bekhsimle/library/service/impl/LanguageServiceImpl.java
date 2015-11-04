package org.bekhsimle.library.service.impl;

import java.util.List;

import org.bekhsimle.library.dao.LanguageDao;
import org.bekhsimle.library.domain.Language;
import org.bekhsimle.library.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author BHARAT
 *
 */
@Transactional
@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	LanguageDao languageDao;
	
	public void saveLanguage(Language language) {
		languageDao.saveLanguage(language);
	}

	public Language getLanguageById(int id) {
		return languageDao.getLanguageById(id);
	}

	public List<Language> getAllLanguages() {
		return languageDao.getAllLanguages();
	}

	public void deleteLanguage(int id) {
		Language language = getLanguageById(id);
		if(language != null)
		languageDao.deleteLanguage(language);
	}

	public String searchLanguage(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
