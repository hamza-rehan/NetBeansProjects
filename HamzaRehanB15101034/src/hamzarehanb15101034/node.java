/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamzarehanb15101034;

/**
 *
 * @author hamza rehan
 */
public class node {
      private String place;
    private int edge;
    private node next;
    
    public node(int e,String lab){
        place=lab;
        edge=e;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
    

    
    public void displayNode(node n){
        System.out.print(" {"+n.getEdge()+" , "+n.getPlace()+"} ");
    }
}
