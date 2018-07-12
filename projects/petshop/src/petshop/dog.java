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
public class dog extends animal{
    private String name;
    private String breed;
    public dog(){
        super();
        this.name="dog";
        this.breed="italian";
    }

    public dog(String aname) {
        super("DOG");
        this.name=aname;
        this.breed="UNKNOWN";
    }
    public dog(String aname,String abreed){
        super("DOG");
        this.name=aname;
        this.breed=abreed;
    }
    public String toString(){
        return super.toString() +"\nIT'S"+ name +"THE"+ breed;
    }
    public void sound(){
        System.out.println("WOOF WOOF");
    }
}
