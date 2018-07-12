/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testline;

/**
 *
 * @author hamza rehan
 */
public class line implements Cloneable {
    private point start=new point();
    private point end=new point();
    public line(){
        this.start.setpoint(0, 0);
        this.end.setpoint(0, 0);
    }
    public line(point start,point end){
        this.start=start;
        this.end=end;
    }
    public line(line myline){
        this(myline.start,myline.end);
    }

    public point getStart() {
        return start;
    }

    public void setStart(point start) {
        this.start = start;
    }

    public point getEnd() {
        return end;
    }

    public void setEnd(point end) {
        this.end = end;
    }
    public void setline(point start,point end){
        this.start=start;
        this.end=end;
    }
    public void show(){
        System.out.println();
        System.out.println("MY LINE STARTS FROM POINT ("+this.start+") TO THE POINT ("+this.end+")");
    }

    @Override
    public String toString() {
        return "MY LINE'S INFO : POINT A ("+this.start+") AND POINT B ("+this.end+")"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        line obj=new line();
        obj=(line) super.clone();
        return obj;//To change body of generated methods, choose Tools | Templates.
    }
    public double slope(point a,point b){
        double m;
        m=(b.gety_axis()-a.gety_axis())/(b.getx_axis()-a.getx_axis());
        return m;
    }
    
}
