package org.billr.SpringBootBook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.billr.SpringBootBook.models.Book;
import org.billr.SpringBootBook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

	private BookRepository bookRepository;
	
	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/")
	public String showBookPage(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		Iterable<Book> allBooks = bookRepository.findAll();
		model.addAttribute("allBooks", allBooks);
		return "books";
	}
	
	@PostMapping("/createBook")
	public String createBook(@Valid @ModelAttribute("book") Book bk, BindingResult result) {
		System.out.println(result.hasErrors());
		if (result.hasErrors()) {
			return "/";
		}
		Book returnedBook= bookRepository.save(bk);
		System.out.println("Returned ID: " + returnedBook.toString());
		 
		return "redirect:/";
	}
}
