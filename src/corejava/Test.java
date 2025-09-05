package corejava;

import java.util.Scanner;

class Sum{
    void add(int a, int b){
        int result;
        result = a+b;
        System.out.println("Sum is: "+result);
    }
}

class Arithmetic extends Sum{
    private int result;
    void subtraction(int a, int b){
        result = a-b;
        System.out.println("Difference is: "+result);
    }
    void divsion(int a, int b){
        result = a/b;
        System.out.println("Quotent is: "+result);
    }
    void Multiplication(int a, int b){
        result = a*b;
        System.out.println("Product is: "+result);
    }
    //override add function and perform sum of three numbers
    void add(int a, int b, int c){
        result = a+b+c;
        System.out.println("Sum is: "+result);
    }
}

//Improvise above code to take inputs from main function.
public class Test{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        
        Arithmetic s1 = new Arithmetic();
        s1.add(a,b);
        s1.divsion(a,b);
        s1.Multiplication(a,b);
        s1.subtraction(a,b);
    }
}

/*Create a Book class with attributes title, author, and price, which has a function to print details. 
Write a program to create objects.*/ 