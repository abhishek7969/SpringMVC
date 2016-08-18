package com.abhi.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloControllerNew {

	@RequestMapping("/welcomeBack")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "This Message is from the new controller.");
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiMsg(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "This Message is from second controller.");
		return modelAndView;
	}
}
