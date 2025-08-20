package com.dcl.bookdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dcl.bookdb.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bs;
	
	public void create() {
		bs.saveBook();
	}
	
	public void findBookById() {
		bs.findBookById();
	}
	
	public void findBookByAuthor() {
		bs.findBookByAuthor();
	}
	
	public void findBookByGenre() {
		bs.findBookByGenre();
	}
	
	public void updateBookPriceByTitleAndAuthor() {
		bs.updateBookPriceByTitleAndAuthor();
	}
	
	public void findBooksBetweenPrice() {
		bs.findBooksBetweenPrice();
	}
	
	public void deletBookById() {
		bs.deletBookById();
	}
}
