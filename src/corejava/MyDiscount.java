/* You are asked to write a discount system for a beauty salon, which provides services and sells beauty products. 
   It offers 3 types of memberships: Premium, Gold and Silver. Premium, gold and silver members receive a discount of 20%, 
   15%, and 10%, respectively, for all services provided. Customers without membership receive no discount. 
   All members receive a flat 10% discount on products purchased (this might change in future). 
   Your system shall consist of three classes: Customer, Discount and Visit. 
   It shall compute the total bill if a customer purchase $x of products and $y of services, for a visit. 
   Also write a test program to exercise all the classes.*/

package corejava;

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
    double getServiceDiscount(String getMemberType){
        switch(getMemberType){
            case "preminum":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0;
        }
    }
    
    double getProductDiscount(){
        return 0.10;
    }
}

public class MyDiscount {
    public static void main(String[] args){
        
    }
}
