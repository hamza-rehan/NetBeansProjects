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
public class point implements Cloneable {
    private double x_axis;
    private double y_axis;
    public point(){
        this.x_axis=4.5;
        this.y_axis=5;
    }
    public point(double x_axis,double y_axis){
        this.x_axis=x_axis;
        this.y_axis=y_axis;
    }
    public point (point mypoint)
    {
        this(mypoint.x_axis,mypoint.y_axis);
    }

    public double getx_axis() {
        return x_axis;
    }

    public void setx_axis(double x_axis) {
        this.x_axis = x_axis;
    }

    public double gety_axis() {
        return y_axis;
    }

    public void sety_axis(double y_axis) {
        this.y_axis = y_axis;
    }
    public void setpoint(double x_axis,double y_axis){
        this.x_axis=x_axis;
        this.y_axis=y_axis;
    }
    void changeposition(double dx,double dy){
        this.x_axis=this.x_axis+dx;
        this.y_axis=this.y_axis+dy;
    }
    void changeposition(vector v){
        this.x_axis=this.x_axis+v.getdelx();
        this.y_axis=this.y_axis+v.getdely();
    }
    vector difference(point p){
        double delx=p.x_axis-this.x_axis;
        double dely=p.y_axis-this.y_axis;
        vector temp=new vector(delx,dely);
        return temp;
    }
    point add(vector d){
        double delx=d.getdelx()+d.getdelx();
        double dely=d.getdely()+d.getdely();
        point tem=new point(delx,dely);
        return tem;
    }
    
    public void show(){
        System.out.println();
        System.out.println("MY POINT'S CO-ORDINATES ARE ("+this.x_axis+","+this.y_axis+")");
        System.out.println();
    }

    @Override
    public String toString() {
        return "MY POINT'S LOCATION IS: "+this.x_axis+"x-axis and "+this.y_axis+"y-axis";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       point obj=new point();
       obj=(point) super.clone();
       return obj;
    }

    /**
     *
     * @param other
     * @return
     */
    
    public boolean equalsto(point other) {
        if(this.x_axis==other.x_axis&&this.y_axis==other.y_axis)
            return true;
        else
            return false;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        boolean obj;
        obj=super.equals(o);
        return obj; //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
