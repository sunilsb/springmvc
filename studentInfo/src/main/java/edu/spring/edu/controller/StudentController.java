package edu.spring.edu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.spring.mvc.model.Student;

@Controller
@RequestMapping(value = "/admission")
public class StudentController {

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		return new ModelAndView("admissionForm");
	}
	
	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ModelAndView("admissionForm");
		}
		return new ModelAndView("admissionSuccess");
	}
	@ModelAttribute
	public void addCommonCode(Model model) {
		model.addAttribute("message", "***Student Details***");
	}
}
