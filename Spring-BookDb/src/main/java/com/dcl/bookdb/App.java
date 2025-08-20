package com.dcl.bookdb;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dcl.bookdb.controller.BookController;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	BookController bc = ac.getBean(BookController.class);
    	Scanner s =  new Scanner(System.in);
        while(true) {
        	System.out.println("\n");
        	System.out.println("-----------------------------------\n");
        	System.out.println("Book Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Find Book By Id");
            System.out.println("3. Find Book By Author");
            System.out.println("4. Find Book By Genre");
            System.out.println("5. Update Book By Title and Author");
            System.out.println("6. Find Book Between Prices");
            System.out.println("7. Delete Book By Id");
            System.out.println("8. Exit");
            System.out.println("Enter your choice");
            int ch = s.nextInt();
            switch(ch) {
            case 1: bc.create();
            break;
            
            case 2: bc.findBookById();
            break;
            
            case 3: bc.findBookByAuthor();
            break;
            
            case 4: bc.findBookByGenre();
            break;
            
            case 5: bc.updateBookPriceByTitleAndAuthor();
            break;
            
            case 6: bc.findBooksBetweenPrice();
            break;
            
            case 7: bc.deletBookById();
            break;
            
            case 8: System.out.println("Exiting....😊😊");
            System.exit(0);
            break;
            
            default: System.out.println("Invalid choice");
            break;
            
            }
        }
        
    }
}

