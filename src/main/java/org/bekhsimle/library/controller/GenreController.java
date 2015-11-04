package org.bekhsimle.library.controller;

import org.bekhsimle.library.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BHARAT
 *
 */
@Controller
public class GenreController {
	
	
	@Autowired
	GenreService genreService;
	
	@RequestMapping(value="/genre/add")
	public String addGenre (){
		
		return "admin/genre/addgenre";
	}
	@RequestMapping(value="/listGenre")
	public String listGenre (){
		
		return "admin/genre/genres";
	}
	

}
