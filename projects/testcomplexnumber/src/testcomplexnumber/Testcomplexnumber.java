/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomplexnumber;

/**
 *
 * @author hamza rehan
 */
public class Testcomplexnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        complexnumber x,y,z1,z2,z3,s1,s2,c;
        x=new complexnumber(4,6);
        y=new complexnumber(6,3);
        z1=new complexnumber();
        z2=new complexnumber();
        z3=new complexnumber();
         s1=new complexnumber();
          s2=new complexnumber();
           c=new complexnumber();
       z1=z1.add(5);
       z2=z2.div(x, y);
       z3=z3.add(x, y);
       s1=s1.sub(7);
       s2=s2.sub(x, y);
       c=c.conjugate(y);
       System.out.println(z1);
       System.out.println(z2);
       System.out.println(z3);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(c);
        // TODO code application logic here
    }
    
}
