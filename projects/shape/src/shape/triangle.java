/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author hamza rehan
 */
public class triangle extends polygon{
    private point v1=new point();
    private point v2=new point();
    private point v3=new point();
     
    public triangle(int x1,int y1,int x2,int y2,int x3,int y3){
       this.v1.setpoint(x1, y1);
       this.v2.setpoint(x2, y2);
       this.v3.setpoint(x3, y3);

    }
    public triangle(point v1,point v2,point v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    public void type(){
        double a,b,c,p;
       a=Math.sqrt(Math.pow((v2.getx_axis()-v1.getx_axis()),2)+Math.pow((v2.gety_axis()-v1.gety_axis()),2));
        b=Math.sqrt(Math.pow((v3.getx_axis()-v2.getx_axis()),2)+Math.pow((v3.gety_axis()-v2.gety_axis()),2));
        c=Math.sqrt(Math.pow((v1.getx_axis()-v3.getx_axis()),2)+Math.pow((v1.gety_axis()-v3.gety_axis()),2));
       
        point p1=new point();
        point p2=new point();
        point p3=new point();
        if(a==b&&b==c){
           System.out.println("IT IS AN EQUILATERAL TRIANGLE");
        }else if(a==b||b==c){
            System.out.println("IT IS AN ISOSCELES TRIANGLE");
        }else
            System.out.println("IT IS AN SCALENE TRIANGLE");
        
    }
    public void getperimeter(){
        double a,b,c,p;
       a=Math.sqrt(Math.pow((v2.getx_axis()-v1.getx_axis()),2)+Math.pow((v2.gety_axis()-v1.gety_axis()),2));
        b=Math.sqrt(Math.pow((v3.getx_axis()-v2.getx_axis()),2)+Math.pow((v3.gety_axis()-v2.gety_axis()),2));
        c=Math.sqrt(Math.pow((v1.getx_axis()-v3.getx_axis()),2)+Math.pow((v1.gety_axis()-v3.gety_axis()),2));
       
        System.out.println("A:"+a+" B:"+b+" C:"+c);
        p=a+b+c;
        
        
    }
    
    public String toString(){
        return" MY TRIANGLE HAVE THREE VERTICES A:"+this.v1.toString()+" B:"+this.v2.toString()+" C:"+this.v3.toString();
    }
}
