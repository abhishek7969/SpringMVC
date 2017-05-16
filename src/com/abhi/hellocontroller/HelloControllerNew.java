package com.abhi.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/greet")
public class HelloControllerNew {

	@RequestMapping("/welcomeBack")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "This Message is from the new controller.");
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{userName}/{countryName}")
	public ModelAndView hiMsg(@PathVariable("countryName") String country,  @PathVariable("userName") String username){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Welcome "+ username + " from "+country);
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{userName}/{countryName}")
	public ModelAndView hiNewMsg(@PathVariable Map<String,String> pathvars){ //  to use this map of path variable u need to use <mvc:annotation-drivers/>
		String  username = pathvars.get("userName");
		String  country = pathvars.get("countryName");
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Welcome "+ username + " from "+country);
		return modelAndView;
	}
	
	
}
