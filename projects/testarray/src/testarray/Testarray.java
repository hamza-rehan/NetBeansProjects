/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author hamza rehan
 */
public class Testarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        array v1=new array();
        array v2=null;
        try{
            v2=(array)v1.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println("v1 :" +v1);
        System.out.println("v2 :" +v2);
        
        v2.increment();
        System.out.println("v2 :" +v2);
        
        System.out.println("v1 :" +v1);
        // TODO code application logic here
    }
    
}
