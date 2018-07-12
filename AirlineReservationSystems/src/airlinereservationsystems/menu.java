/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class menu {
    String c;
    Scanner input;
    internationalflight t;
    localflight f;
    public void menu() throws FileNotFoundException{
        System.out.println("\t\t\t=====================================================");
        System.out.println("\t\t\t\t***********THE TRAVELERS**********");
        System.out.println("\t\t\t\t======WELCOME WHERE YOU FEEL COMFORT=======");
        System.out.println("\t\t\t=====================================================");
   input=new Scanner(System.in);
            
       System.out.println("WHICH TYPE OF FLIGHT YOU WANT TO TAKE");
        System.out.println("1:LOCAL  \n2:INTERNATIONAL");
          c=input.next();  

        
        
             t=new internationalflight("isl","khi",4);
                if (c.equals("international")||c.equals("INTERNATIONAL")){
            t.directflight();
    
        }
        else{
         f=new localflight("isl","khi",4);
    
        f.searching();
        }


    }
}
