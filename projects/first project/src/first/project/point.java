/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.project;

/**
 *
 * @author hamza rehan
 */
public class point  {
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
    
    public void show(){
        System.out.println();
        System.out.println("MY POINT'S CO-ORDINATES ARE ("+this.x_axis+","+this.y_axis+")");
        System.out.println();
    }

    @Override
    public String toString() {
        return "MY POINT'S LOCATION IS: "+this.x_axis+"x-axis and "+this.y_axis+"y-axis";
    }

    
    
}
