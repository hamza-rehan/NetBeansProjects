/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpoint;

/**
 *
 * @author hamza rehan
 */
public class vector implements Cloneable {
     private double delx;
    private double dely;
    public vector(){
        this.delx=6;
        this.dely=2;
    }
    public vector(double delx,double dely){
        this.delx=delx;
        this.dely=dely;
    }
    public vector (vector myvector)
    {
        this(myvector.delx,myvector.dely);
    }

    public double getdelx() {
        return delx;
    }

    public void setdelx(double delx) {
        this.delx = delx;
    }

    public double getdely() {
        return dely;
    }

    public void setdely(double dely) {
        this.dely = dely;
    }
    public void setvector(double delx,double dely){
        this.delx=delx;
        this.dely=dely;
    }
     vector dotproduct(vector a, vector b){
        vector c=new vector();
        c.delx=a.delx*b.delx;
        c.dely=a.dely*b.dely;
        return c;
    }
     vector crossproduct(vector a, vector b){
        vector c=new vector();
        c.delx=a.delx*b.dely;
        c.dely=a.dely*b.delx;
        return c;
    }
    public void show(){
        System.out.println();
        System.out.println("MY VECTOR'S CO-ORDINATeS ARE ("+this.delx+"x,"+this.dely+"y)");
        
    }

    @Override
    public String toString() {
        return "MY VECTOR'S LOCATION IS: "+this.delx+"x and "+this.dely+"y";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       vector obj=new vector();
       obj=(vector) super.clone();
       return obj;
    }
   
}
