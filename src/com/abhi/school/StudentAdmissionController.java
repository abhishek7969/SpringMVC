package com.abhi.school;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"studentMobile"});
		
		/**
		 * want to register that format to webDataBinder Ref. 
		 * Hi Spring MVC when ever ur doing data binding for studentDOB then follow this format.
		 * 
		 * MVC internally use property editor to perform data binding task,Spring has many build in classes call PropertyEditorClasses.
		 * MVC uses PropertyEditorClasses to perform type conversion during data binding
		 */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		
		/**
		 * Spring mvc will not bind the studentName property unless it consult the StudentNameEditor
		 */
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
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
	public ModelAndView submitAdmissionFormNew(@Valid @ModelAttribute("student1") Student student1,BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("AdmissionFrom");
			return model;

		}
		ModelAndView model = new ModelAndView("AdmissionSuccessNew");
		return model;
		
	}
	
	
	
	
	
}
