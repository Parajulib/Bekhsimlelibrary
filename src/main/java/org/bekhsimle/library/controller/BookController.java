package org.bekhsimle.library.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bekhsimle.library.domain.Book;
import org.bekhsimle.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author BHARAT
 *
 */
@Controller
@SessionAttributes("book")
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/book/add")
	public String addBook(){
		
		return "admin/home";
	}
	@RequestMapping(value="/listBook")
	public String listBook(){
		
		return "admin/book/books";
	}
	
	@RequestMapping(value="/book/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute Book book){
		bookservice.saveBook(book);
		return "redirect:/book";
	
	}
	
	
	
	

}
