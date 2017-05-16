package com.abhi.school;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	/**
	 * Spring MVC will automatically add that object to the model object of each request handler method which is present in this controller class. 
	 * thats why commented the line 28 and 56.
	 * 
	 * It will called first before calling any controller.
	 * @param model
	 */
	@ModelAttribute
	public void addingCommonObject(Model model){
		model.addAttribute("headerMsg", "TP College of Engineering India!!");
	}

	@RequestMapping(value ="/admissionFrom.html" , method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionFrom");
		//model.addObject("headerMsg" , "TP College of Engineering India!!");		
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html" , method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value = "studentName" , defaultValue="Abhishek rathur") String name,@RequestParam("studentHobby") String hobby){
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg" ,"Details submited by you are Name : " + name + " and hobby is "+ hobby);
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionFormOld.html" , method= RequestMethod.POST)
	public ModelAndView submitAdmissionFormOld(@RequestParam(value = "studentName" , defaultValue="Abhishek rathur") String name,@RequestParam("studentHobby") String hobby){
		
		Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);	
		
		ModelAndView model = new ModelAndView("AdmissionSuccessNew");
		model.addObject("headerMsg" , "TP College of Engineering india");		
		model.addObject("student1" ,student1);
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionFormNew.html" , method= RequestMethod.POST)
	public ModelAndView submitAdmissionFormNew(@ModelAttribute("student1") Student student1){
		
		ModelAndView model = new ModelAndView("AdmissionSuccessNew");
		//model.addObject("headerMsg" , "TP College of Engineering India!!");		
		return model;
		
	}
	
	
	
	
	
}
