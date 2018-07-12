/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

/**
 *
 * @author hamza rehan
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        top t=new top();
        t.report();
        System.out.println(t.n);
        
        top b=new bottom();
        b.report();
        System.out.println(b.n);
        
        top m =new middle();
        m.report();
        System.out.println(m.n);
        top a=new bottom();
        a.report();
        System.out.println(a.n);
        // TODO code application logic here
    }
    
}
