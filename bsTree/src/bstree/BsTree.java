/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author hamza rehan
 */
public class BsTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tree t1=new tree();
        node n1=new node(14,20);
        node n2=new node(13,24);
        
        node n3=new node(15,34);
        t1.insert(n1);
        t1.insert(n2);
        t1.insert(n3);
        t1.inorder(n1);
        t1.preorder(n1);   
        t1.postorder(n1);
           
    
    }
    
}
