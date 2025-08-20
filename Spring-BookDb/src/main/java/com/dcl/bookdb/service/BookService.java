package com.dcl.bookdb.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.bookdb.entity.BookEntity;
import com.dcl.bookdb.repository.BookRepository;

@Service
public class BookService {
	Scanner s = new Scanner(System.in);
	@Autowired
	private BookRepository br;
	
	public void saveBook() {
		BookEntity b = new BookEntity();
		System.out.println("Enter book details");
		System.out.println("Enter book title");
		b.setTitle(s.nextLine());
		System.out.println("Enter book author");
		b.setAuthor(s.nextLine());
		System.out.println("Enter book genre");
		b.setGenre(s.nextLine());
		System.out.println("Enter book price");
		b.setPrice(s.nextDouble());
		
		br.addBook(b);
		System.out.println("Book added successfully");
	}
	
	public void findBookById() {
		System.out.println("Enter book id to find:");
		int id = s.nextInt();
		BookEntity book = br.findBookById(id);
		System.out.println("Book details are");
		System.out.println("------------------------------------");
		System.out.println("Book title: "+book.getTitle());
		System.out.println("Book author: "+book.getAuthor());
		System.out.println("Book genre: "+book.getGenre());
		System.out.println("Book price: "+book.getPrice());
	}
	
	public void findBookByAuthor() {
		System.out.println("Enter book author");
		String author= s.nextLine();
		List<BookEntity> books = br.findBookByAuthor(author);
		System.out.println("Book details are");
		System.out.println("-------------------------------------");
		for(BookEntity b: books) {
			System.out.println("Book title: "+b.getTitle());
			System.out.println("Book author: "+b.getAuthor());
			System.out.println("Book genre: "+b.getGenre());
			System.out.println("Book price: "+b.getPrice());
		}
	}
	
	public void findBookByGenre() {
		System.out.println("Enter book genre");
		String genre= s.nextLine();
		List<BookEntity> books = br.findBookByAuthor(genre);
		System.out.println("Book details are");
		System.out.println("-------------------------------------");
		for(BookEntity b: books) {
			System.out.println("Book title: "+b.getTitle());
			System.out.println("Book author: "+b.getAuthor());
			System.out.println("Book genre: "+b.getGenre());
			System.out.println("Book price: "+b.getPrice());
			System.out.println();
		}
	}
	
	public void updateBookPriceByTitleAndAuthor() {
		System.out.println("Enter Book title");
		String title = s.nextLine();
		System.out.println("Enter Book author");
		String author = s.nextLine();
		System.out.println("Enter Book price to be updated");
		double price = s.nextDouble();
		
		int res = br.updateBookPriceByTitleAndAuthor(title, author, price);
		if(res>0)
			System.out.println("Book price updated successfully");
		else
			System.out.println("Book price updation failed, Book not found");
	}
	
	public void findBooksBetweenPrice() {
		System.out.println("Enter price 1:");
		double p1 = s.nextDouble();
		System.out.println("Enter price 2");
		double p2 = s.nextDouble();
		
		List<BookEntity> list = br.findBooksBetweenPrice(p1, p2);
		for(BookEntity b: list) {
			System.out.println("Book title: "+b.getTitle());
			System.out.println("Book author: "+b.getAuthor());
			System.out.println("Book genre: "+b.getGenre());
			System.out.println("Book price: "+b.getPrice());
			System.out.println();
		}
	}
	
	public void deletBookById() {
		System.out.println("Enter id to delete");
		int id = s.nextInt();
		br.deletBookById(id);
		System.out.println("Book deleted successfully");
	}

}
