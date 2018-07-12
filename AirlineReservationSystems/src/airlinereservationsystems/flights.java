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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class flights {
     static  int count=0;
    
    
    public String[] hours;
    
    public String[] dest;
    public int[] dur;
    
    int i=0;
    
           
            public flights() throws FileNotFoundException{
                this.dest=new String[8];
                this.dur=new int[8];
                this.hours=new String[8];
                count++;
            }
            public void directflight(File f) throws FileNotFoundException{
                //flights f1=new flights(); 
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                 Scanner input=new Scanner(f);
                
                while(input.hasNext()){
                this.dest[i]=input.next();
                this.dur[i]=input.nextInt();
                this.hours[i]=input.next();
                count++;    
                i++;
                }
               //     System.out.println(dest[i] +" "+ dur[i] + hours[i]);
                    
                
                
            }
            @Override
            public String toString(){
                for(int i=0;i<count;i++)
                    System.out.println(""+dest[i]+" IN "+dur[i]+" "+hours[i]);
                return"";
            }
           
                
            
            
            
            
}
