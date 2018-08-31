package com.sangram.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

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

import com.sangram.model.Student;
import com.sangram.propeditors.StudentNamePropertyEditor;

@Controller
public class RegController {

	ModelAndView mv;

	@RequestMapping(value = "/regForm.htm", method = RequestMethod.GET)
	public ModelAndView getRegForm() {
		/*if ("NULLP".equals("NULLP")) {
			throw new NullPointerException();
		}*/
		mv = new ModelAndView();
		mv.setViewName("regForm");
		return mv;
	}

	/*
	 * This method will add this specified attribute to every ModelAndview object in
	 * every method present in this controller class
	 */

	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("headervalue", "UNCHARTED 4");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "umob" });
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "uname", new StudentNamePropertyEditor());
	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public ModelAndView getConfirmation(@Valid @ModelAttribute Student student, BindingResult result) {
		mv = new ModelAndView();
		if (result.hasErrors()) {
			mv.setViewName("regForm");
		} else {
			mv.setViewName("success");
		}
		return mv;
	}

	/*
	 * Without using ModelAttribute Annotation
	 * 
	 * @RequestMapping(value="/reg",method=RequestMethod.POST) public ModelAndView
	 * getConfirmation(@RequestParam(value="uname",defaultValue="MR.XXX") String
	 * uname,
	 * 
	 * @RequestParam("uemail") String uemail,
	 * 
	 * @RequestParam("upwd") String upwd){
	 * 
	 * Student std = new Student(); std.setUname(uname); std.setUemail(uemail);
	 * std.setUpwd(upwd); mv = new ModelAndView(); mv.setViewName("success");
	 * mv.addObject("headervalue","Welcome to This Website"); mv.addObject("std",
	 * std); return mv; }
	 */

}
