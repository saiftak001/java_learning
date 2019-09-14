package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		Student theStudent = new Student();

		model.addAttribute("student", theStudent);

		return "student-form";
	}

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmer);

	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theresultBinding) {

		System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName());

		if (theresultBinding.hasFieldErrors()) {
			return "student-form";
		}

		return "student-confirmation";
	}

}
