/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author hamza rehan
 */
public class circle implements Cloneable{
    private point center=new point();
    private double radius;
    public circle(){
        this.center.setpoint(0, 0);
        this.radius=6;
    }
    public circle(point center,double radius){
        this.center=center;
        this.radius=radius;
    }
    public circle(circle newcircle){
        this(newcircle.center,newcircle.radius);
    }

    public point getCenter() {
        return center;
    }

    public void setCenter(point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public double getcircumference(){
        double circumference;
        circumference=2*(Math.PI)*this.getRadius();
        return circumference;
    }
    public double getarea(){
        double area;
        area=(Math.PI)*(this.getRadius()*this.getRadius());
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setcircle(point center,double radius){
        this.center=center;
        this.radius=radius;
    }
    public void show(){
        System.out.println();
        System.out.println("MY CIRCLE'S INFO : CENTER IS AT POINT ("+this.center+") OF RADIUS "+this.radius);
    }
public circle mycloneeffort(){
    circle theclone=new circle();
    theclone.center.setpoint(this.center.getx_axis(), this.center.gety_axis());
    theclone.radius=this.radius;
    return theclone;
}
    @Override
    public String toString() {
        return "MY CIRCLE IS AT POINT ("+this.center.toString()+") AND RADIUS "+this.radius; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        circle obj=new circle();
        obj=(circle) super.clone();
return obj;//To change body of generated methods, choose Tools | Templates.
    }
    
}
