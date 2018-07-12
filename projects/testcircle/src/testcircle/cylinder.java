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
public class cylinder extends circle {
    private float height;
    public cylinder(){
        super();
        this.height=6;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    @Override
    public double getarea(){
        double area;
        area=(2*(Math.PI)*this.getRadius()*this.height)+2*this.getRadius()*this.getRadius();
        return area;
    }

    @Override
    public String toString() {
        return"cylinder info "+this.getCenter().toString()+" of height "+this.height;
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
