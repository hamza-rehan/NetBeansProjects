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
public class linkedlist {
    private node n1;
    
    public linkedlist(){
        this.n1=new node("",0);
        n1.setNext(null);
        
    }
    public void insert(node n){
        node current=n1;
        if(current.getNext()==null){
            n1.setNext(n);
            
            
        }
        else{
            while(current.getNext()!=null){
                
               
                    current=current.getNext();
                
            }
        }
        current.setNext(n);
    }
    public void delete(int id){
        node current=n1;
        node previous=n1;
        if(current.getNext()==null)
            System.out.println("LINKED LIST IS EMPTY");
        else{
            while(current.getEdge()!=id){
                previous=current;
                current=current.getNext();
            }
           
        }
         previous.setNext(current.getNext());
    }
    
    public void show(){
        node current=n1;
        while(current!=null){
            current.displayNode();
            current=current.getNext();
        }
        System.out.println("");
    }
}
