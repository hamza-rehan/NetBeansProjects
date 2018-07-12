/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author hamza rehan
 */
public class animal {
    private String type;
    public animal(){
        this.type="unknown";
    }
    public animal(String atype){
        type=new String(atype);
    }
    public String toString(){
        return"IT'S TYPE IS "+type;
    }
    public void sound(){
        
    }
}
