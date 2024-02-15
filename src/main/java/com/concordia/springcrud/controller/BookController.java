package com.concordia.springcrud.controller;

import com.concordia.springcrud.entity.Book;
import com.concordia.springcrud.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

	@GetMapping("/delete")
	public String delete(@RequestParam("bookId") int theId) {
		bookService.deleteById(theId);
		return "redirect:/books/list";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Book theBook = new Book();
		theModel.addAttribute("book", theBook);
		return "book-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int theId, Model theModel) {
		Book theBook = bookService.findById(theId);
		theModel.addAttribute("book", theBook);
		return "book-form";
	}

	private final BookService bookService;
	public BookController(BookService theBookService) {
		bookService = theBookService;
	}

	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book theBook) {
		bookService.save(theBook);
		return "redirect:/books/list";
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listBooks(Model theModel) {

		// get the employee from db
		List<Book> theBook = bookService.findAll();

		// add to the spring model
		theModel.addAttribute("books", theBook);

		return "list-books";
	}

}
