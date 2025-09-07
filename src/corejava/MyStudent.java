
package corejava;

import java.util.Scanner;

/**
 *
 * @author Sohan
 */
/* Create a class Person which has three data members name, age and address. 
   Create setter and getter methods to set and get given data members. 
   Derive a class Student from Person class, which has a data member rollNo. Create setter and getter to set and get rollNo. 
   Now, create an object in main method and set all the details of student. 
   Except, set rollNo only if student’s age is greater than or equals to 16. Also, display all the details of Student.*/

class Person{
    private String name, address;
    private int age;
    void setAll(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    int getAge(){
        return age;
    }
}

class Student extends Person{
    private int rollno;
    void setRoll(int roll){
        rollno = roll;
    }
    int getRoll(){
        return rollno;
    }
}

public class MyStudent {
    public static void main(String[] args){
        Student s = new Student();
        String name,address;
        int age;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter address: ");
        address = sc.next();        
        
        s.setAll(name, address, age);
        if(s.getAge()>=16){
           s.setRoll(1);
        }
        
        System.out.println("Name: "+ s.getName());
        System.out.println("Addrss: "+s.getAddress());
        System.out.println("Age: "+s.getAge());
        System.out.println("Roll no: "+s.getRoll());
    }
}

















