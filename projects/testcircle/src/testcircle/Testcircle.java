/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in import java.util.logging.Level;
import java.util.logging.Logger;the editor.
 */
package testcircle;



import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamza rehan
 */
public class Testcircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area,circumference;
        point p1=new point(3,5);
        circle r1=new circle(p1,4);
        point p2=new point(4,6);
        circle r2=new circle(p2,3);
        System.out.println("MY CIRCLE BEFORE CLONING IS :");
        System.out.println(r1);
        System.out.println(r2);
        try{
            r2=(circle)r1.clone();
        }catch(CloneNotSupportedException ex){
            Logger.getLogger(Testcircle.class.getName()).log(Level.SEVERE,null,ex);
        }
        System.out.println("MY CIRCLE AFTER CLONING IS :");
        System.out.println(r1);
        System.out.println(r2);
        circle c4=r1.mycloneeffort();
        System.out.println(c4);
        area=r1.getarea();
        System.out.println("THE AREA OF THE CIRCLE IS : "+area+"m^2");
        circumference=r2.getcircumference();
        System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS : "+circumference+"m");
        cylinder c;
        c = new cylinder();
        area=c.getarea();
        System.out.println(area);
        System.out.println(c);
        // TODO code application logic here
    } //To change body of generated methods, choose Tools | Templates.
   
    
    
}
