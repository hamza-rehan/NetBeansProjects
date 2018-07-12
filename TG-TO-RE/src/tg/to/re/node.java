/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.to.re;

/**
 *
 * @author hamza rehan
 */
public class node {
    public String s;
    public int i;

    public node(int i , String s ) {
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "node{ "+ s + ", " + i + '}';
    }
    
    
}
