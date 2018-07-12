/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrankingsystem;

import static carrankingsystem.carlist.askUserForChoice;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class CarRankingSystem {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carlist fleet=new carlist();
        car c=new car();
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanline=new Scanner(System.in);
        String menu="1- INPUT, 2-COMPARE, 3-OUTPUT";
        final int mainMenuSelection;
        
    
        mainMenuSelection=askUserForChoice(scanner,menu,3);
switch(mainMenuSelection){        
    case 1:
            System.out.println("HOW MANY CARS YOU WANT TO SORT ??");
           
       
               
           int num=scanner.nextInt();
           for (int i = 0; i < num; i++) {
               System.out.println("ENTER CAR INFO: ");
               System.out.println("NAME : ");
              
           String line=scanline.next();
              System.out.println("MILEAGE : ");
              
           double mileage=scanline.nextDouble();
            System.out.println("COST : ");
              
           int cost=scanline.nextInt();
           fleet.addcar(line, mileage, cost);
                   }
           fleet.show();
            for(int i=0;i<num;i++)
         System.out.println(fleet.clist[i].toString());
            System.out.println("ENTER CRITERIA FOR SORTING : NAME MILAGE");
            String line1=scanner.next();
            String[] splits=line1.split("-");
            carlist fl=new carlist();
            fl=fleet.sort(fleet.clist, line1);
             
         break;
    case 2:   
        System.out.println("ENTER");
 

      
}
       }
}

        // TODO code application logic here
    
    

