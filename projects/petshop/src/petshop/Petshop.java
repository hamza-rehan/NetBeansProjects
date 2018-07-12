/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.ArrayList;

/**
 *
 * @author hamza rehan
 */
public class Petshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  animal [] theanimals={new dog(" ROVER "),new dog(" POODLE "),
        //                      new cat(" MAX "),new cat(" ABSSINIAN "),
          //                    new duck(" DAFFY "),new cat(" AYLESBURRY ")};
        //animal petChoice = null;
        //Random select=new Random();
        //for(int i=0;i<5;i++){
            
        
       // petChoice= theanimals[select.nextInt(theanimals.length)];
        
        //System.out.println("\nYOUR CHOICE IS\n" +petChoice);
        //petChoice.sound();
        ArrayList pets=new ArrayList();
        dog Dog=new dog();
        pets.add(Dog);
        int index=pets.indexOf(Dog);
       
        dog dog1= (dog) pets.get(index);
//        Object dog2=pets.get(index);
//        dog2.sound();
        }
        
        // TODO code application logic here
    }
    

