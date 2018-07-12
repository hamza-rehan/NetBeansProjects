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
public class cat extends animal{
    private String name;
    private String breed;
    public cat(String aname){
        super("CAT");
        this.name=aname;
        this.breed="UNKNOWN";
    }
    public cat(String aname,String abreed){
        super("CAT");
        this.name=aname;
        this.breed=abreed;
    }
    public String toString(){
        return super.toString() +"\n IT'S "+ name + "THE" + breed;
    }
    public void sound(){
        System.out.println("MEOW MEOW");
    }
}
