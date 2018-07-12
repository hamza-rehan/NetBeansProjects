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
public class duck extends animal {
    private String name;
    private String breed;
    public duck(String aname){
        super("DUCK");
        this.name=aname;
        this.breed="UNKNOWN";
    }
    public duck(String aname,String abreed){
        super("DUCK");
        this.name=aname;
        this.breed=abreed;
    }
    public String toString(){
        return super.toString()+"\n IT's"+ name + "THE" +breed;
    }
    public void sound(){
        System.out.println("QUACK QUACK");
    }
}
