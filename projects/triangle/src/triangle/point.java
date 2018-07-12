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
public class point  {
    private float x_axis;
    private float y_axis;
    
    public point(){
        this.x_axis=4;
        this.y_axis=5;
        
    }
    public point(float x_axis,float y_axis){
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

    public void setx_axis(float x_axis) {
        this.x_axis = x_axis;
    }

    public double gety_axis() {
        return y_axis;
    }

    public void sety_axis(float y_axis) {
        this.y_axis = y_axis;
    }
    public void setpoint(float x_axis,float y_axis){
        this.x_axis=x_axis;
        this.y_axis=y_axis;
    }
    void changeposition(float dx,float dy){
        this.x_axis=this.x_axis+dx;
        this.y_axis=this.y_axis+dy;
    }
    public double distance(point p1,point p2){
        double distance;
        distance=Math.sqrt(Math.pow((p2.x_axis-p1.x_axis),2)+Math.pow((p2.y_axis-p1.y_axis),2));
        return distance;
    }
    
    public void show(){
        System.out.println();
        System.out.println("MY POINT'S CO-ORDINATES ARE ("+this.x_axis+","+this.y_axis+")");
        System.out.println();
    }

    @Override
    public String toString() {
        return" "+this.x_axis+"x-axis and "+this.y_axis+"y-axis";
    }

    
    
}
