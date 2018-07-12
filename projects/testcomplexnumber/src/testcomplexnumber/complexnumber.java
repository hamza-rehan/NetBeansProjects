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
public class complexnumber {
    private double realnumber;
    private double imaginarynumber;
    
    public complexnumber()
    {
        this.realnumber=5;
        this.imaginarynumber=6;
    }
    public complexnumber(double realnumber,double imaginarynumber){
        this.realnumber=realnumber;
        this.imaginarynumber=imaginarynumber;
    }
    public complexnumber(complexnumber newcomplexnumber){
        this(newcomplexnumber.realnumber,newcomplexnumber.imaginarynumber);
    }
    public double getrealnumber(){
        return realnumber;
    }
    public void setrealnumber(double realnumber){
        this.realnumber=realnumber;
    }
    public double getimaginarynumber(){
        return imaginarynumber;
    }
    public void setimaginarynumber(double imaginarynumber){
        this.imaginarynumber=imaginarynumber;
    }
    public void setcomplexnumber(double realnumber,double imaginarynumber)
    {
        this.realnumber=realnumber;
        this.imaginarynumber=imaginarynumber;
    }
    public complexnumber add(complexnumber a,complexnumber b){
        complexnumber c=new complexnumber();
        c.realnumber=a.realnumber+b.realnumber;
        c.imaginarynumber=a.imaginarynumber+b.imaginarynumber;
        return c;
    }
     public complexnumber add(int i){
        complexnumber c=new complexnumber();
        complexnumber a=new complexnumber();
        c.realnumber=a.realnumber+i;
        c.imaginarynumber=a.imaginarynumber;
        return c;
    }
     public complexnumber sub(complexnumber a,complexnumber b){
        complexnumber c=new complexnumber();
        c.realnumber=a.realnumber-b.realnumber;
        c.imaginarynumber=a.imaginarynumber-b.imaginarynumber;
        return c;
    }
     public complexnumber sub(int i){
        complexnumber c=new complexnumber();
        complexnumber a=new complexnumber();
        c.realnumber=a.realnumber-i;
        c.imaginarynumber=a.imaginarynumber;
        return c;
     }
     public complexnumber conjugate(complexnumber j){
         complexnumber d=new complexnumber();
         d.realnumber=j.realnumber;
         d.imaginarynumber=j.imaginarynumber*(-1);
         return d;
     }
     public complexnumber div(complexnumber a,complexnumber b){
         complexnumber c=new complexnumber();
         complexnumber d=new complexnumber();
         double i;
         d=d.conjugate(b);
         c.realnumber=(a.realnumber*d.realnumber-a.imaginarynumber*d.imaginarynumber);
         c.imaginarynumber=(a.realnumber*d.imaginarynumber+a.imaginarynumber*d.realnumber);
         i=(d.realnumber*d.realnumber)+(d.imaginarynumber*d.imaginarynumber);
         c.realnumber=c.realnumber/i;
         c.imaginarynumber=c.imaginarynumber/i;
         return c;
     }
    public void show()
    {
        System.out.println();
        System.out.println("YOUR COMPLEX NUMBER IS ("+this.realnumber+","+this.imaginarynumber+")");
        
    }
    @Override
    public String toString(){
        return"COMPLEX NUMBER INFO : REAL PART IS "+this.realnumber+" AND IMAGINARY PART IS "+this.imaginarynumber+"i";
    }
}
