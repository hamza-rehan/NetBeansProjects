/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author hamza rehan
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        point p1=new point(3,3);
        point p2=new point(3,3);
        point p3=new point(3,3);
        mytriangle t1=new mytriangle(p1,p2,p3);
        System.out.println(t1);
        double n;
        
        t1.getperimeter();
        t1.type();
        // TODO code application logic here
    }

    
    
}
