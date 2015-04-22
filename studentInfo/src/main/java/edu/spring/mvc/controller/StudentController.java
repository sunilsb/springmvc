package edu.spring.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.spring.mvc.customPropertyEditor.StudentNameEditor;
import edu.spring.mvc.model.Student;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	
	private static final Logger logger = Logger.getLogger(StudentController.class);
	
	public StudentController() {
		System.out.println("***Inside StudentController constructor***");
	}

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		logger.debug("***enters getAdmissionForm method***");
		return new ModelAndView("admissionForm");
	}
	
	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
		logger.debug("***enters submitAdmissionForm method***");
		if(bindingResult.hasErrors()) {
			return new ModelAndView("admissionForm");
		}
		return new ModelAndView("admissionSuccess");
	}

	@ModelAttribute
	public void addCommonCode(Model model) {
		logger.debug("***enters addCommonCode method***");
		model.addAttribute("message", "***Student Details***");
	}
	
	/*
	 * For customizing the binding properties
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		logger.debug("***enters initBinder method***");
//		binder.setDisallowedFields(new String [] {"dob","mobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "firstName", new StudentNameEditor());
	}
}
