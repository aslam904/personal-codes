package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.BookStoreService;

@Controller
@Scope("request")
public class BookMvcController {
	
	
	@Autowired
	@Qualifier("bookstoreService")
	private BookStoreService ser;
	
	
	@GetMapping("/allbooks")
	public ModelAndView getAllBooks() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("books", ser.getAllBooks());
		mv.setViewName("index.html");
		return mv;
		
	}

}
