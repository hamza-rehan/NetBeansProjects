/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class AirlineReservationSystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       menu m=new menu();
       m.menu();
//      Information[] arr={new registration("khi","lhr",20),new registration(),new internationalflight("khi","lhr",20),new internationalflight(),
//                         new localflight(),new localflight("DUBAI","LAHORE",4)};
//      Information I;
//      Random select=new Random();
//        for (int i = 0; i < 3; i++) {
//            I=arr[select.nextInt(arr.length)];
//            System.out.println(I);
//        }
     Scanner input=new Scanner(System.in);
   
        System.out.println("SHALL WE CONTINUE REGISTRATION OR NOT");
        String a=input.next();
        if(a.equals("yes")||a.equals("YES"))
 
        {   
       
    ticket ti=new ticket();
    ti.ticketdate();
    ti.ticket();
        }
}
}
