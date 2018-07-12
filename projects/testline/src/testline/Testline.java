/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testline;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamza rehan
 */
public class Testline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        point x1,y1,x2,y2;
        line l1,l2;
        double m;
        x1=new point(6,2);
        y1=new point(5,3);
        x2=new point(4,4);
        y2=new point(3,5);
        l1=new line(x1,y1);
        l2=new line(x2,y2);
        System.out.println("MY LINE'S BEFORE CLONING IS");
        System.out.println(l1);
        System.out.println(l2);
        try{
            l2=(line)l1.clone();
        }catch(CloneNotSupportedException ex){
            Logger.getLogger(Testline.class.getName()).log(Level.SEVERE, null, ex); 
        }
        System.out.println(l1);
        System.out.println(l2);
        m=l1.slope(x1, y1);
        System.out.println(m);
        // TODO code application logic here
    }
    
}
