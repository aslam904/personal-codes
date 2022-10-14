package com.mphasis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mphasis.entity.Book;
import com.mphasis.service.BookService;

@Controller
@Scope("request")
public class BookMvcController {
	
	
	@Autowired
	private BookService ser;
	
	@RequestMapping(value = "add", method=RequestMethod.GET)
	public ModelAndView viewAddEmployeePage() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("storeBook.html");
		return mav;
	}
	
	@RequestMapping(value="storeBook",method=RequestMethod.POST)
	public ModelAndView storeEmployee(HttpServletRequest request,Book book,HttpSession hs ) {
		book.setBook_id(Integer.parseInt(request.getParameter("id")));
		book.setBook_title(request.getParameter("name"));
		book.setBook_publisher(request.getParameter("publisher"));
		book.setBook_isbn(request.getParameter("isbn"));
		book.setBook_pages(request.getParameter("pages"));
		book.setBook_year(request.getParameter("year"));
		
		Book result=ser.save(book);
		hs.setAttribute("msg", result);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("storeBook.html");
		return mav;
	}
	
	
	@GetMapping("/allbooks")
	public ModelAndView getAllBooks() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("books", ser.getAllBooks());
		mv.setViewName("index.html");
		return mv;
		
	}

}
