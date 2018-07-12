/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

/**
 *
 * @author hamza rehan
 */
public class bottom extends top{
    public int n=3;
    public void report(){
        super.report();
        super.n=this.n;
        System.out.println("BYE");
    }
}
