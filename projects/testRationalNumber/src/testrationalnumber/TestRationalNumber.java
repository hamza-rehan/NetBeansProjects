/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrationalnumber;

/**
 *
 * @author hamza rehan
 */
public class TestRationalNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RationalNumber k,l,m,r1,m1;
        r1=new RationalNumber(2,6);
        k=new RationalNumber(3,4);
        l=new RationalNumber(5,6);
        m1=new RationalNumber(5,6);
      //  m=k.add(r1,l);
       // m.show();
       // l=l.add(5);
       // l.show();
       // r1=r1.mul(r1, m1);
       // r1.show();
       // m1=m1.div(k, r1);
       // m.show();
    
        //boolean equal;
        //RationalNumber a=new RationalNumber();
        //RationalNumber b=new RationalNumber();
        //equal=a.equals(b);
        //if(equal)
         //   System.out.println("WE ARE EQUAL");
        //else System.out.println("WE ARE NOT EQUAL");
         //boolean bigger;
        //RationalNumber c=new RationalNumber();
        //RationalNumber d=new RationalNumber();
        
        //if(a.greaterthan(b))
         //   System.out.println("I AM GREATER");
       // else System.out.println("I AM NOT GREATER");
       RationalNumber r2=new RationalNumber(2,6); 
       Object o1=r1;
        Object o2=r2;
        System.out.println(r1.equals(r2));
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(o2));
        System.out.println(o1.equals(r2));
        System.out.println(r1.equals(o1));
      //  o1=null;
        System.out.println(r1.equals(o1));
        integers r=new integers();
        System.out.println(r);
        // TODO code application logic here   
    }
    
}
