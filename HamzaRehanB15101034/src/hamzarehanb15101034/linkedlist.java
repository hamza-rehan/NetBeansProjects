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
public class linkedlist {
    private node n1;
    public int temp=-1;
    public linkedlist (){
        n1=new node(0,null);
    }
    
    public linkedlist(node n){
        this.n1=n;
       // n1.setNext(null);
        
    }
    public void insert(node n){
        node current=n1;
        if(current.getPlace()==null){
            n1=n;
            
            
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
    
    public int search(String n){
        node current=n1;
        
        while(current!=null){
            
            
        
        if(current.getPlace().equals(n)){
            temp=current.getEdge();
            break;
        }
            
        else
            current=current.getNext();

        }
        int no=temp;
        return no;
    }
    
    public boolean searchnext(String n){
        node current=n1;
        node current2=n1;
        boolean ch=false;
        while(current!=null){
            
            
        
        if(current.getPlace().equals(n)){
            temp=current.getEdge();
            current=current.getNext();
            
        if(current==null)
           break;
                if(current.getNext()==null &&current.getPlace().equals(n)){
                    temp=current.getEdge();
            break;}
                }
            
        
            
        else
            current=current.getNext();
        

        }
        if(temp==-1)
        
        return false;
        else return true;
    }
    
    public void put(String[] a,linkedlist l,int[] b){
        node current=n1.getNext();
        
        for (int i = 0; i < a.length; i++) {
            
        
 
            if(current==null){
                break;
            }else{
            a[i]=current.getPlace();
            b[i]=current.getEdge();
            current=current.getNext();
            
        }
        }
    }
    public void show(){
        node current=n1;
        while(current!=null){
            current.displayNode(current);
            current=current.getNext();
        }
        System.out.println("");
    }
}
