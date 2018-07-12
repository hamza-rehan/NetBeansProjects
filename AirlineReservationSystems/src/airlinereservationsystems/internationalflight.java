/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import static airlinereservationsystems.plane.Class.ECONOMY;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */

    public class internationalflight extends Information {
        int i,e;
 public plane p=new plane("",170,ECONOMY);
  public internationalflight(){
      super();
  } 
 public internationalflight(String source, String destination, int duration) {
        super(source, destination, duration);
    }


public void directflight() throws FileNotFoundException{
    int k=0;
    flights fl1=new flights();
    
    flights fl2=new flights();
    flights fl3=new flights();
     
     File f1=new File("D:/khi.txt"); 
        File f4=new File("D:/DUBAI.txt");
        File f5=new File("D:/BANKOK.txt");
    
        
        
        
        Scanner input=new Scanner(System.in);
        
       
        System.out.println("ENTER THE DESIRED AEROPLANE NAME \nPIA\nAIRBLUE");
        String a=input.next();
        p.plane(a.toUpperCase());
        if(a.equals("pia")||a.equals("PIA")||a.equals("airblue")||a.equals("AIRBLUE")){
        System.out.println("ENTER YOUR ORIGIN");
        c=input.next();
        
        System.out.println("ENTER YOUR DESTINATION");
         d=input.next().toUpperCase();
         
   
 switch (c) {
        case "karachi":
            fl1.directflight(f1);
            
            for(i=0;i<fl1.dest.length;i++){
                if (d.equals(fl1.dest[i])){
                  q="found";
                  
                break;
               
                
                
            }
            else
            q="not found";
           
            }
            break;
            case "dubai":
            fl1.directflight(f4);
            
            for(i=0;i<fl1.dest.length;i++){
                if (d.equals(fl1.dest[i])){
                  q="found";
                  
                break;
               }
                
            
            
            else
            q="not found";
            }
           break;
        case "bankok":
            fl1.directflight(f5);
            
            for(i=0;i<fl1.dest.length;i++){
                if (d.equals(fl1.dest[i])){
                  q="found";
                  
                break;
               }
                
            
            
            else
            q="not found";
            }
           break;
        default:
            break;
    }
      

    }
    switch(q){
        
        case "found":
            System.out.println( "   "+fl1.dest[i]+"  IN "+fl1.dur[i]+" "+fl1.hours[i]);
break;

      
               case "not found":
        
        
        switch(c){
           
                case "karachi":
                    for (int j = 0; j < fl1.dest.length; j++) {
                        if(fl1.dest[j].equals("DUBAI")){
                            
                            m=fl1.dur[j];
                            fl2.directflight(f4);
                            for (int l = 0; l < fl2.dest.length; l++) {
                            if(d.equals(fl2.dest[l])){
                             b=m+fl2.dur[l];
                             break;
                            }
                           
                            }
                            
                           
                        }
                        if(fl1.dest[j].equals("BANKOK")){
                            
                            m=fl1.dur[j];
                            fl3.directflight(f5);
                            for (int l = 0; l < fl3.dest.length; l++) {
                            if(d.equals(fl3.dest[l])){
                             w=m+fl3.dur[l];
                             break;
                            }
                           
                            }
                            
                           
                        }
                    }
                    
                     if (b==-1&&w==-1){
                          System.out.println("NO FLIGHTS");
                          break;
                      }
                     if(b==-1){
                         if(w>0)
                              System.out.println("KARACHI ---> BANKOK ---> "+d+" IN "+w+" "+fl3.hours[0]);
                     break;
                     }
                     else if(w==-1){
                         if(b>0)
                             System.out.println("KARACHI ---> DUBAI --->"+d+" IN "+b+" "+fl2.hours[0]);
                     break;
                     } 
                        System.out.println("NO DIRECT FLIGHTS FOUND !!!");
        System.out.println("BUT THERE IS A CONNECTING FLIGHT");
                      
                      System.out.println("\n1.SHORTEST ROUTE\n2.ALL FLIGHTS\n");
                         int  o=input.nextInt();
                       if(o==1){
                         if(b<w)
                          
                     System.out.println("KARACHI ---> DUBAI ---> "+d+" IN "+w+" "+fl2.hours[0]);
                         else if(w<b)
                               System.out.println("KARACHI ---> BANKOK ---> "+d+" IN "+w+" "+fl3.hours[0]);
                       }
                           else if(o==2){
                     System.out.println("KARACHI ---> BANKOK ---> "+d+" IN "+w+" "+fl3.hours[0]);
                           System.out.println("KARACHI ---> DUBAI --->"+d+" IN "+b+" "+fl2.hours[0]);
                               
                         
                                   
                         
                           
                          System.out.println("WHICH FLIGHT IS BETTER FOR YOU ?\nFIRST OR SECOND");
                          String n=input.next();
                         
                           }
                         
                      else
                              
                          System.out.println("KARACHI ---> DUBAI --->"+d+" IN "+w+" "+dur);
                      break;
                       
                case "dubai":
                    for (int j = 0; j < fl1.dest.length; j++) {
                        if(fl1.dest[j].equals("BANKOK")){
                            
                            m=fl1.dur[j];
                            fl2.directflight(f5);
                            for (int l = 0; l < fl2.dest.length; l++) {
                            if(d.equals(fl2.dest[l])){
                             b=m+fl2.dur[l];
                             break;
                            }
                           
                            }
                            
                           
                        }
                        if(fl1.dest[j].equals("KARACHI")){
                            
                            m=fl1.dur[j];
                            fl3.directflight(f1);
                            for (int l = 0; l < fl3.dest.length; l++) {
                            if(d.equals(fl3.dest[l])){
                             w=m+fl3.dur[l];
                             break;
                            }
                           
                            }
                            
                           
                        }
                    }
                    
                     if (b==-1&&w==-1){
                          System.out.println("NO FLIGHTS");
                          break;
                      }
                     if(b==-1){
                         if(w>0)
                              System.out.println("DUBAI ---> KARACHI ---> "+d+" IN "+w+" "+fl3.hours[0]);
                     break;
                     }
                     else if(w==-1){
                         if(b>0)
                             System.out.println("DUBAI ---> BANKOK ---> "+d+" IN "+b+" "+fl2.hours[0]);
                     break;
                     } 
                        System.out.println("NO DIRECT FLIGHTS FOUND !!!");
        System.out.println("BUT THERE IS A CONNECTING FLIGHT");
                      System.out.println("\n1.SHORTEST ROUTE\n2.ALL FLIGHTS\n");
                           o=input.nextInt();
                       if(o==1){
                         if(b<w)
                          
                     System.out.println("DUBAI ---> BANKOK ---> "+d+" IN "+b+" "+fl2.hours[0]);
                         else if(w<b)
                               System.out.println("DUBAI ---> KARACHI ---> "+d+" IN "+w+" "+fl3.hours[0]);
                       }
                           else if(o==2){
                     System.out.println("DUBAI ---> BANKOK ---> "+d+" IN "+w+" "+fl3.hours[0]);
                           System.out.println("DUBAI ---> KARACHI ---> "+d+" IN "+b+" "+fl2.hours[0]);
                               
                         
                                   
                         
                           
                          System.out.println("WHICH FLIGHT IS BETTER FOR YOU ?\nFIRST OR SECOND");
                          String n=input.next();
                         
                           }
                         
                      else
                              
                          System.out.println("DUBAI ---> KARACHI ---> "+d+" IN "+w+" "+dur);
                      break;
                      
                case "bankok":
                      for (int j = 0; j < fl1.dest.length; j++) {
                        if(fl1.dest[j].equals("DUBAI")){
                            
                            m=fl1.dur[j];
                            fl2.directflight(f4);
                            for (int l = 0; l < fl2.dest.length; l++) {
                            if(d.equals(fl2.dest[l])){
                             b=m+fl2.dur[l];
                             break;
                            }
                           
                            }
                            
                           
                        }
                        if(fl1.dest[j].equals("KARACHI")){
                            
                            m=fl1.dur[j];
                            fl3.directflight(f1);
                            for (int l = 0; l < fl3.dest.length; l++) {
                            if(d.equals(fl3.dest[l])){
                             w=m+fl3.dur[l];
                             break;
                            }
                           
                            }
                            
                           
                        }
                    }
                    
                     if (b==-1&&w==-1){
                          System.out.println("NO FLIGHTS");
                          break;
                      }
                     if(b==-1){
                         if(w>0)
                              System.out.println("BANKOK ---> KARACHI ---> "+d+" IN "+w+" "+fl3.hours[0]);
                     break;
                     }
                     else if(w==-1){
                         if(b>0)
                             System.out.println("BANKOK ---> DUBAI --->"+d+" IN "+b+" "+fl2.hours[0]);
                     break;
                     } 
                         
                        System.out.println("NO DIRECT FLIGHTS FOUND !!!");
        System.out.println("BUT THERE IS A CONNECTING FLIGHT");
                      System.out.println("\n1.SHORTEST ROUTE\n2.ALL FLIGHTS\n");
                           o=input.nextInt();
                       if(o==1){
                         if(b<w)
                          
                     System.out.println("BANKOK ---> DUBAI ---> "+d+" IN "+b+" "+fl2.hours[0]);
                         else if(w<b)
                               System.out.println("BANKOK ---> KARACHI ---> "+d+" IN "+w+" "+fl3.hours[0]);
                       }
                           else if(o==2){
                     System.out.println("BANKOK ---> DUBAI ---> "+d+" IN "+w+" "+fl3.hours[0]);
                           System.out.println("BANKOK ---> KARACHI ---> "+d+" IN "+b+" "+fl2.hours[0]);
                               
                         
                                   
                         
                           
                          System.out.println("WHICH FLIGHT IS BETTER FOR YOU ?\nFIRST OR SECOND");
                          String n=input.next();
                         
                           }
                         
                      else
                              
                          System.out.println("DUBAI ---> KARACHI ---> "+d+" IN "+w+" "+dur);
                      break;
                      
                default:
                    break;
    
}

        }
    }
    
}
    