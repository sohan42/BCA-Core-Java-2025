package corejava;

import java.util.*;

/*WAP to enter different numbers in ArrayList using user input. Also display the largest and smallest number from 
  the ArrayList. Also display their index and swap value.*/ 

class Numbers{
    
}

public class MyNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c,max,min,imin=0,imax=0;
        ArrayList<Integer> al = new ArrayList<>(); 
        System.out.println("How many number do you want to enter?");
        c = sc.nextInt();
        System.out.println("Enter numbers: ");
        for(int i=1;i<=c;i++){ //Input numbers
            al.add(sc.nextInt());
        }
        
        System.out.println("Elements in arraylist: ");
        for(int i:al){ //display arraylist using for-each loop
            System.out.println(i);
        }
        
        min = al.get(0); 
        max = al.get(0);
        for(int i=0;i<=al.size()-1;i++){ //loop to visit arraylist
            if(al.get(i)<min){ //chcek min value
                min = al.get(i);
                imin = i;
            }
            if(al.get(i)>max){ //check max value
                max = al.get(i);
                imax = i;
            }
        }
        System.out.println("Larger element is "+max+" at index: "+imax);
        System.out.println("Smaller element is "+min+" at index: "+imin);
        
        al.set(imax, min); //swap max value with min
        al.set(imin, max); //swap min valu with max
        System.out.println("Arraylist after swapping largest and smallest elements: ");
        for(int i:al){//display arraylist using for-each loop
            System.out.println(i);
        }
    }
}
