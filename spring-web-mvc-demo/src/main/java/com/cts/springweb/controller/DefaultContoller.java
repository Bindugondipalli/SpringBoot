package com.cts.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultContoller {
	@RequestMapping({"","/","/Home"})
	public ModelAndView defaultGetRequestHandler() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		mv.addObject("pageTitle","Home Page- Welcome All");
		mv.addObject("developers",new String[] {"Vamsy","Bindu","Deepu"});
		return mv;
		
	}

}
