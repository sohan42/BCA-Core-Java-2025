/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava;

import static java.lang.System.exit;
import java.util.Scanner;

class Operation{
    Scanner sc = new Scanner(System.in);
   
    void search(int arr[], int size){
    int e;
    System.out.println("Enter element to be search: ");
    e = sc.nextInt();
        for(int i=0; i<size; i++){
          if(e==arr[i]){              
              System.out.println("Element "+e+" found at index "+i);
              exit(0);
          }
          
        }
         System.out.println("Searched element not found!");        
    }
    
    void sum(int arr[], int size){
        int sum=0;
        for(int i=0; i<size; i++){
            sum+=arr[i];
        }
        System.out.println("Sum is: "+sum);
    }
    
    void greatest(int arr[], int size){
        
    }
    
    void smallest(int arr[], int size){
        
    }

}
