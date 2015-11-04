package org.bekhsimle.library.controller;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.bekhsimle.library.domain.Role;
import org.bekhsimle.library.domain.UserLogin;
import org.bekhsimle.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BHARAT
 *
 */
@Controller
public class HomeController {
	
	
	@Autowired
	UserService userService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	
	@RequestMapping("/")
	public String homePage(){
		return "index";
		
	}
	
	@RequestMapping("/login")
	public String loginPage() {

		return "admin/login";
	}

	@RequestMapping("/home")
	public String dashPage() {

		return "admin/home";
	}
	
	@RequestMapping("/createadmin")
	public void createAdmin(HttpServletResponse response) {
		String result = "failed";
		try {

			UserLogin user = userService.getUserByUsername("admin");

			if (user == null) {
				user = new UserLogin();
				user.setUsername("admin");
				user.setPassword("admin");
				user.setEnabled(true);
				user.setRole(Role.ROLE_ADMIN);
				userService.changePassword(user);

				result = "Admin Created Successfully";

			} else {
				result = "Admin already exist";
			}

			response.getWriter().println(result);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
