/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrankingsystem;

/**
 *
 * @author hamza rehan
 */
public class car {
    private String name;
    private double mileage;
    private int cost;
    
    public car()
    {
        this.name="";
        this.mileage=0;
        this.cost=0;
    }
    public car(String name,double mileage,int cost){
        this.name=name;
        this.mileage=mileage;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
        @Override
    public String toString(){
     return " CAR INFO: NAME "+this.name+" HAVE A MILEAGE "+this.mileage+" OF COST "+this.cost;
 }
   
}
