/* You are asked to write a discount system for a beauty salon, which provides services and sells beauty products. 
   It offers 3 types of memberships: Premium, Gold and Silver. Premium, gold and silver members receive a discount of 20%, 
   15%, and 10%, respectively, for all services provided. Customers without membership receive no discount. 
   All members receive a flat 10% discount on products purchased (this might change in future). 
   Your system shall consist of three classes: Customer, Discount and Visit. 
   It shall compute the total bill if a customer purchase $x of products and $y of services, for a visit. 
   Also write a test program to exercise all the classes.*/

package corejava;

import java.util.Scanner;

class Customer{
    private String name;
    private boolean member;
    private String memberType;
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setMember(boolean member){
        this.member = member;
    }
    boolean isMember(){
        return member;
    }
    void setMemberType(String memberType){
        this.memberType = memberType;
    }
    String getMemberType(){
        return memberType;
    }
}

class Discount{
    static double getServiceDiscount(String getMemberType){
        switch(getMemberType){
            case "preminum":
                return 0.2;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0;
        }
    }
    static double getProductDiscount(){
        return 0.10;
    }
}

class Visit{
    private double serviceExpense, productExpense;
    Customer c;
    Visit(Customer c){
        this.c = c;
    }
    void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    double getServiceExpense(){
        if(c.isMember()){
            return serviceExpense-(serviceExpense * Discount.getServiceDiscount(c.getMemberType()));
        }
        else{
            return serviceExpense;
        }
    }
    void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    double getproductExpense(){
        if(c.isMember()){
            return productExpense-(productExpense * Discount.getProductDiscount());
        }
        else{
            return productExpense;
        }
    }
    double totalExpense(){
        return getServiceExpense()+getproductExpense();
    }
}

public class MyDiscount {
    public static void main(String[] args){
        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);
        char check;
        
        System.out.println("Enter name: ");
        c.setName(sc.nextLine());
        
        System.out.println("Is a member? Enter Y/N");
        check = sc.next().toLowerCase().charAt(0);
        if(check=='y'){
            c.setMember(true);
            System.out.println("Enter membership type premium/gold/silver/");
            c.setMemberType(sc.next().toLowerCase());
        }
        else{
            c.setMember(false);
        }
        
        Visit v = new Visit(c);
        System.out.println("Enter product expense: ");
        v.setProductExpense(sc.nextDouble());
        System.out.println("Enter service expense: ");
        v.setServiceExpense(sc.nextDouble());
        
        System.out.println("Customer name: "+c.getName());
        System.out.println("Product Expense: "+v.getproductExpense());
        System.out.println("Service Expense: "+v.getServiceExpense());
        System.out.println("Total Expense: "+v.totalExpense());
    }
}