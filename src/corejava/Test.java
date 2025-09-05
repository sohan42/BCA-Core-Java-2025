package corejava;

import java.util.Scanner;

class Sum{
    private int a,b,result;
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        result = a+b;
        System.out.println("Sum is: "+result);
    }
}

class Arithmetic extends Sum{
    private int a,b,c,result;
    void subtraction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        result = a-b;
        System.out.println("Difference is: "+result);
    }
    void divsion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        result = a/b;
        System.out.println("Quotent is: "+result);
    }
    void Multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        result = a*b;
        System.out.println("Product is: "+result);
    }
    //override add function and perform sum of three numbers
    @Override
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        result = a+b+c;
        System.out.println("Sum is: "+result);
    }
}

//Improvise above code to take inputs from main function
public class Test{
    public static void main(String[] args) {
        Arithmetic s1 = new Arithmetic();
        s1.add();
        s1.divsion();
        s1.Multiplication();
        s1.subtraction();
    }
}

