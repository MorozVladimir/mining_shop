package org.itstep.mining_shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegController {
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("title", "Регистрация" );
		model.addAttribute("style","resources/css/reg.css");
		model.addAttribute("script","resources/css/reg.js");
		
		return "reg/index";
	}

}
