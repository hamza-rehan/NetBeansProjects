/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karachiroutes;

/**
 *
 * @author hamza rehan
 */
public class vertex {
    private String place;
    private int edge;
    
    public vertex(String lab,int e){
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
    
}


