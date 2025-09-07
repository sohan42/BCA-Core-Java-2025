package corejava;

import java.util.Scanner;

/**
 *
 * @author Sohan
 */

/*Create a Book class with attributes title, author, and price. which has a function to print details and parameterized
constructor to initialize their vale. Write a program to create objects.*/ 
class Book{
    private String title, author; 
    private float price;
    Book(String title, String author, float price){ //parameterized constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}

public class MyBook { //create records for 10 books (Take input from user). 
    public static void main(String[] args){
        String t,a;
        float p;
        Scanner sc = new Scanner(System.in);
        
        Book[] book = new Book[2];//Array of object
        for(int i=0;i<book.length;i++){ //loop
            System.out.println("Enter Title: ");
            t = sc.next();
            System.out.println("Enter Author: ");
            a = sc.next();
            System.out.println("Price: ");
            p = sc.nextFloat();
            book[i] = new Book(t,a,p);
        }  
        
        for (Book book1 : book) {//for-each loop
            book1.display();  
        }
    }
}


/* Create a class Person which has three data members name, age and address. 
   Create setter and getter methods to set and get given data members. 
   Derive a class Student from Person class, which has a data member rollNo. Create setter and getter to set and get rollNo. 
   Now, create an object in main method and set all the details of student. 
   Except, set rollNo only if student’s age is greater than or equals to 16. Also, display all the details of Student.*/