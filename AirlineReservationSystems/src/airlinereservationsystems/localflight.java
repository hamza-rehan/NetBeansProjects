/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */

 public class localflight extends Information {

    public localflight(String source, String destination, int duration) {
        super(source, destination, duration);
    }
    public localflight(){
        super();
    }
    
    public void searching() throws FileNotFoundException{
      
        File f1=new File("D:/khi.txt");
        File f2=new File("D:/lhr.txt");
        File f3=new File("D:/isl.txt");
        FileReader fr=new FileReader(f1);
        FileReader fr2=new FileReader(f2);
        FileReader fr3=new FileReader(f3);
        BufferedReader br=new BufferedReader(fr);
        BufferedReader br2=new BufferedReader(fr2);
        BufferedReader br3=new BufferedReader(fr3);
        Scanner khi=new Scanner(f1);
        Scanner lhr=new Scanner(f2);
        Scanner isl=new Scanner(f3);
        Scanner input=new Scanner(System.in);
        
 
        System.out.println("ENTER YOUR ORIGIN");
        c=input.next();
        System.out.println("ENTER YOUR DESTINATION");
         d=input.next().toUpperCase();
       
       
    switch (c) {
        case "karachi":
         int arr[][]=new int[2][3];
         int i=0,k=0;
            while(khi.hasNext()){
                 destination=khi.next();
                 n=khi.nextInt();
                 dur=khi.next();
                if (d.equals(destination)){
                  q="found";
                break;
                }
                else q="not found";
            }
            break;
            case "lahore":
            while(lhr.hasNext()){
                 destination=lhr.next();
                 n=lhr.nextInt();
                 dur=lhr.next();
                if (d.equals(destination)){
                    q="found";
                break;
                }
                else
                    q="not found";
            }
            
        break;
        case "islamabad":
            while(isl.hasNext()){
                 destination=isl.next();
                 n=isl.nextInt();
                 dur=isl.next();
                if (d.equals(destination)){
                    q="found";
                break;
                }
                else q="not found";
            }
            
            break;
        default:
            break;
    }
      

    
    switch(q){
        case "found":
            System.out.println( "   "+destination+"  IN "+n+" "+dur);
            break;
       case "not found":
        System.out.println("NO FLIGHTS FOUND !!!");
        
    }

    
    
    
    }
    
    
    
}   

