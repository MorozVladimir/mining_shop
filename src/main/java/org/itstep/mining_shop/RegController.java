package org.itstep.mining_shop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import models.User;
import models.UserContext;

@Controller
public class RegController {
	
	@RequestMapping(value = "/reg", method = RequestMethod.DELETE)
	public String home1(Model model) {		
		model.addAttribute("title", "Регистрация" );
		model.addAttribute("style","resources/css/reg.css");
		model.addAttribute("script","resources/css/reg.js");		
		return "reg/index";
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView home() {	
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("reg/index");
		modelAndView.addObject("user", new User());
		modelAndView.addObject("style","resources/css/reg.css");
		modelAndView.addObject("title", "Регистрация" );
		modelAndView.addObject("script","resources/js/reg.js");		
		return modelAndView;
	}
	
	
	
	@RequestMapping(value = "/isequal", method = RequestMethod.GET)
	public @ResponseBody 
	boolean isEqual(@RequestParam String p1, @RequestParam String p2) {		
		if(p1.equals(p2))return true;
		else return false;
	}
	
	@RequestMapping(value = "/iscontain", method = RequestMethod.GET, produces = {"text/html; charset=UTF-8"})
	public @ResponseBody
	String isContain(@RequestParam String login) {
		UserContext context = new UserContext();
		if(context.isContain(login)) { return login; }
		return login+"_contr";
	}
	
	
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user) {				
		UserContext context = new UserContext();		
		String login  = user.getLogin();
 		String passw1 = user.getPassw1();
		String passw2 = user.getPassw2();
		String email = user.getEmail();
		String regdate  = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
		String status = "norm";		
		User u1 = new User(login, passw1, passw2, email, regdate, status);		
		context.addUser(u1);				
		return new ModelAndView("reg/raport", "user", u1);
	}
}
