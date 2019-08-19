package favoriteBook;

import java.util.Scanner;

//Write a program to guess for a favorite book, which:
//Reads a favorite book's name
//Reads book names until it reaches the favorite book
//Prints "Book found!" and stops afterwards
//Prints "Invalid book: " + book for all invalid books
 
	public class FavoriteBook {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       String favoriteBook = scanner.nextLine();
	       String nameBook = scanner.nextLine();
	       while(!nameBook.equals(favoriteBook) ){
	          System.out.println("Invalid book: " + nameBook);
	          String book = scanner.nextLine(); 
	          nameBook = book;
	       }
	       System.out.println("Book found!");
	    }
	}
