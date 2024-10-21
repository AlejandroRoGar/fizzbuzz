

package com.mycompany.ej1fizzbuzz;


public class EJ1FIZZBUZZ {

    public static void main(String[] args) {
        numero();
        
    }
    
public static void numero(){
    for(int number=1; number<=100;number++)
        
        if(number % 5==0 && number % 3==0){
            System.out.println("FIZZBUZZ"); 
            
        }

        else if(number % 5==0){
            System.out.println("BUZZ");    
        }
        else if(number % 3==0){
            System.out.println("FIZZ");    
        }
        
        else{
         System.out.println(number);
        }
               
        }
    }
    
    

