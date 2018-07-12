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
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        firstclass car=new firstclass();
        point p1=new point(4,5);
        point p2=new point(6,3);
car.cng=4;
car.fuelcapacity=500;
car.mileage=1500;
car.speed=220;
float fuelaverage=car.fuelaverage();
System.out.println("MY CAR'S FUEL AVERAGE IS 4 LIGHTS PER "+car.fuelaverage()+"KM");
System.out.println("MY CAR'S MAXIMUM SPEED IS "+car.speed+"KM/H");
        System.out.println("MY CAR START'S FROM "+p1.toString()+"AND STOP'S AT "+p2.toString());
// TODO code application logic here
    }
    
}
