package org.bekhsimle.library.dao.impl;

import java.util.List;

import org.bekhsimle.library.dao.LanguageDao;
import org.bekhsimle.library.domain.Language;
import org.bekhsimle.library.util.ConnectionUtil;
import org.springframework.stereotype.Repository;


/**
 * @author BHARAT
 *
 */
@Repository
public class LanguageDaoImpl extends ConnectionUtil implements LanguageDao {

	public void saveLanguage(Language language) {
		getSession().saveOrUpdate(language);
	}

	public Language getLanguageById(int id) {
		return (Language) getSession().get(Language.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Language> getAllLanguages() {
		return getSession().createQuery("FROM Language").list();
	}


	public void deleteLanguage(Language language) {
		getSession().delete(language);
	}
	
	public String searchLanguage(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
