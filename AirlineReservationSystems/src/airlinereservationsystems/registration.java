/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */

 public class registration extends Information {
String c;
public registration(){
    super();
}
    public registration(String source, String destination, int duration) {
        super(source, destination, duration);
    }
    
     public void register(){
         System.out.println("YOUR NAME");
         Scanner input=new Scanner(System.in);
        
         c=input.nextLine();
         name=c;
         
        
         System.out.println("AGE");
         int p=input.nextInt();
          age=p;
        
        do{
         System.out.println("MALE/FEMALE");
         c=input.next();
        }
         while(!c.equals("male")||c.equals("female"));
             gender=c;
         
        
         System.out.println("YOUR ID CARD NO");
          o= input.nextDouble();
         
        
         
        
        
            
        
         System.out.println("YOUR ADDRESS PLEASE");
         Scanner inputs=new Scanner(System.in);
         String c=inputs.nextLine();
         address=c;
        
     }
           
     
}   


