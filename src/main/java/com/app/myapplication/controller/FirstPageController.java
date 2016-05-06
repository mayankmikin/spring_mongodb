package com.app.myapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FirstPageController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String indexpage(Model model)
	{
		model.addAttribute("greeting", "Hello World this the index page");
		return "welcome";
	}
	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
	        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	        return "welcome";
	    }

	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public String getIndexPage() {
		return "getUser";
	}

}
