/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpoint;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hamza rehan
 */
public class Testpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        point j=new point(3,4);
        point k=new point(5,6);
        System.out.println("MY POINT BEFORE CLONING IS ");
        j.show();
        System.out.println(k);
        System.out.println("MY POINT AFTER CLONING IS ");
        try{
            k= (point)j.clone();
        }catch(CloneNotSupportedException ex){
            Logger.getLogger(Testpoint.class.getName()).log(Level.SEVERE,null,ex);
        }
        System.out.println(j);
        System.out.println(k);
        
          vector v1=new vector(2,3);
        vector v2=new vector(5,4);
        System.out.println("WE LOOKS LIKE POINT BUT WE ARE VECTOR ");
        v1.show();
        System.out.println(v2);
        
        point car=new point(0,0);
        vector distance=new vector();
        car.changeposition(distance);
        point mousecursor=new point(2,3);
        mousecursor.changeposition(3, 4);
        System.out.println("mouse is positioned at: "+mousecursor);
        point P=new point(5,10);
        point Q=new point(7,12);
        vector displacement=P.difference(Q);
        System.out.println("DIFFERENCE BETWEEN 2 POINTS IS A VECTOR: "+displacement);
        point QQ=P.add(displacement);
        System.out.println(QQ);
        
        v1=v1.dotproduct(v1, v2);
        v1.show();
        v2=v2.crossproduct(v2, v1);
        v2.show();
        boolean e;
        e=j.equals(j);
        if(e)
            System.out.println("WE ARE EQUAL");
        else
            System.out.println("WE ARE DIFFERENT");
        // TODO code application logic here
    }
    
}
