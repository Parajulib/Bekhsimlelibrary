package org.bekhsimle.library.controller;

import org.bekhsimle.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BHARAT
 *
 */
@Controller
public class AuthorController {

	
	@Autowired
	AuthorService authorService;
	
	
	@RequestMapping(value="/author/add")
	public String addAuthor (){
		
		return "admin/author/addauthor";
	}
	@RequestMapping(value="/listAuthor")
	public String listAuthor (){
		
		return "admin/author/authors";
	}
	
}
