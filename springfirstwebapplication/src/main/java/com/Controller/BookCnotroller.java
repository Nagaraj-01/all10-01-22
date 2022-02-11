package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.springwebapp.Repository.BookRepository;

@Controller
public class BookCnotroller {
	
	private final BookRepository bookRepository;
	
	
	public BookCnotroller(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}




	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books",bookRepository.findAll());
		
		return "books";
		
	}

}
