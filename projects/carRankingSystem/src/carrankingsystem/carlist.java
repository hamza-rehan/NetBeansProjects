/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrankingsystem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class carlist {
    public car[] clist;
    public static int objectCounter;
    public double totalcost;
    
    public carlist(){
        this.clist=new car[1];
        objectCounter=0;
        this.totalcost=0;
    }
    public static int askUserForChoice(Scanner scanner,String prompt,int maxvalue){
        System.out.println("PLEASE SELECT MENU ITEM");
        System.out.println(prompt);
        int value=scanner.nextInt();
        
        while(value<1 || value>maxvalue){
            System.out.println("INVALID MENU ITEM, PLEASE TRY AGAIN");
            value=scanner.nextInt();
        }
        return value;
    }
    public static String askUserForChoice(Scanner name,Scanner mileage){
        System.out.println("ENTER CAR INFO: NAME MILAGE");
        System.out.println(name);
        String value=name.next();
        
       
        return value;
    }
    private void increasesize(){
        car[] tempReference=new car[this.clist.length*2];
        objectCounter++;
        for(int c=0;c<this.clist.length;c++)
        tempReference[objectCounter]=clist[c];
        
        this.clist=tempReference;
    }
      public void addcar(String name,double milage,int cost)
   {
       if(this.clist.length==this.objectCounter)
       {
           increasesize();
            clist[objectCounter]=new car(name,milage,cost);
       this.objectCounter++;
       }
       else{
       clist[objectCounter]=new car(name,milage,cost);
       this.objectCounter++;}
   }

    
    private int find(String name,double mileage,int cost){
        int i=0;
        for(i=0;i<objectCounter;i++){        
        if(name==clist[i].getName()&&mileage==clist[i].getMileage()&&cost==clist[i].getCost()){
        return i+1;}
        }
        
        return -1;
    
    }
    private int find(double mileage){
      int i=0;
      for(i=0;i<objectCounter;i++){
          if(mileage==clist[i].getMileage())
              return i+1;
      }
      
      
      return -1;
    }
    public int find(String name){
        int i=0;
        for(i=0;i<this.clist.length;i++){
            if(clist[i] !=null){
            if(clist[i].getName().equals(name))
                return i;
            }
        }
        return -1;
    }
    public void show(){
        System.out.println("CARS LIST");
        
    }
    
    @Override
    public String toString() {
        String result="";
        
            result+=this.clist.toString();
        
        return result;
    }
    
    public carlist sort(car[] unsortedlist,String usercriteria){
        car[] sortedlist=new car[unsortedlist.length];
        switch(usercriteria){
            case "name":
                String[] namearray=new String[unsortedlist.length];
                for(int i=0;i<unsortedlist.length;i++)
                                       namearray[i]="";
               for(int i=0;i<unsortedlist.length;i++)
               { if(unsortedlist[i] !=null)
               

                    namearray[i]=unsortedlist[i].getName();
                }
                
                Arrays.sort(namearray);
                System.out.println(Arrays.toString(namearray));
                for(int i=0;i<namearray.length;i++){
                                        if(namearray[i]==null || namearray[i].equals(""))
                       continue;
                        int idx=this.find(namearray[i]);
                        
                        sortedlist[i]=new car(unsortedlist[idx].getName(),unsortedlist[idx].getMileage(),unsortedlist[idx].getCost());
                    }
                break;
                case "milage":
                    double[] milagearray=new double[unsortedlist.length];
                    for(int i=0;i<objectCounter;i++){
                        milagearray[i]=unsortedlist[i].getMileage();
                    }
                    
                    Arrays.sort(milagearray);
                    System.out.println(Arrays.toString(milagearray));
                    for(int i=0;i<objectCounter;i++){
                        int idx=this.find(milagearray[i]);
                        sortedlist[i]=new car(unsortedlist[idx].getName(),unsortedlist[idx].getMileage(),unsortedlist[idx].getCost());
                    }
                    break;
                case "cost":
                    break;
                    default:
                    break;
        }
        carlist outl=new carlist();
        outl.clist=sortedlist;
        outl.objectCounter=sortedlist.length;
      //  System.out.println(outl);
        return outl;
    }
    
}
