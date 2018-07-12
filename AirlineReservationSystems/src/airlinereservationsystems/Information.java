/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.math.BigInteger;

/**
 *
 * @author hamza rehan
 */

    public class Information  {
  protected  String source;
    protected String destination;
   protected int duration;
 //  protected int[][] arr=new arr[][];
   
protected  String q=null ,dur=null,c=null,d=null;
        int n=0,w=-1,b=-1,m=-1;
        double cnic,o;
        int age;
    String name,gender,address;
    public Information(){
        this.source="";
        this.destination="";
        this.duration=0;
    }
    public Information(String source, String destination, int duration) {
        this.source = source;
        this.destination = destination;
        this.duration = duration;
    }
   
    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    // public void seatno(){
         double irand= Math.random();
       int a= (int) (irand*100);
      
  @Override
  public String toString(){
     return "NAME: "+name+"\r\n YOUR AGE: "+age+"\r\nYOUR ID CARD NO: "+cnic+"\r\nMALE/FEMALE: "+gender+"\r\n ADDRESS : "+address+"\r\nYOUR SEAT NO IS:: "+a;
   
}
   }

