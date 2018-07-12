/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1=new File("D:/PIA.txt");
        File f2=new File("D:/AIRBLUE.txt");
        FileReader fr=new FileReader(f1);
        FileReader fr2=new FileReader(f2);
        BufferedReader br=new BufferedReader(fr);
         BufferedReader br2=new BufferedReader(fr2);
        Scanner word=new Scanner(f1);
        Scanner word2=new Scanner(f2);
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER YOUR DESIRED AEROPLANE S.no\n1.PIA\n2.AIRBLUE\n");
        String a=input.next();
        
        //System.out.println(a);
        if(a.equals("pia")||a.equals("PIA")){
        System.out.println("ENTER YOUR ORIGIN");
        String c=input.next().toUpperCase();
        System.out.println("ENTER YOUR DESTINATION");
        String d=input.next().toUpperCase();
        System.out.println("ENTER THE DATE(DATE/YEAR/MONTH)");
        String e=input.next().toUpperCase();
        System.out.println("THESE ARE THE FLIGHTS");
        while(word.hasNext()){
            
            String origin=word.next();
            String destination=word.next();
            String date=word.next();
            if(c.equals(origin)&&d.equals(destination)&&e.equals(date))
               
            System.out.println(""+origin+" TO   "+destination+"  ON "+date);
        }
        
        }
        else if (a.equals("airblue")||a.equals("AIRBLUE1")){
         System.out.println("ENTER YOUR ORIGIN");
        String o=input.next().toUpperCase();
        System.out.println("ENTER YOUR DESTINATION");
        String des=input.next().toUpperCase();
        System.out.println("ENTER THE DATE(DATE/YEAR/MONTH)");
        String dat=input.next().toUpperCase();
        System.out.println("THESE ARE THE FLIGHTS");
        while(word2.hasNext()){
            
            String origin=word2.next();
            String destination=word2.next();
            String date=word2.next();
            if(o.equals(origin)&&des.equals(destination)&&dat.equals(date))
               
            System.out.println(""+origin+" TO   "+destination+"  ON "+date);
        }
            
        }
       
      
    }
    
}
