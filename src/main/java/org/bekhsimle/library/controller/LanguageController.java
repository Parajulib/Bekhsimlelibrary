package org.bekhsimle.library.controller;

import org.bekhsimle.library.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BHARAT
 *
 */
@Controller
public class LanguageController {
	
	@Autowired
	LanguageService languageService;
	
	@RequestMapping(value="/language/add")
	public String addLanguage(){
		
		return "admin/language/addlanguage";
	}
	
	@RequestMapping(value="/listLanguage")
	public String listLanguage(){
		
		return "admin/language/languages";
	}
	

}
