/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.to.re;

import java.util.ArrayList;

/**
 *
 * @author hamza rehan
 */
public class TGTORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int FS[]={0,3};
   int IS[]={0};
        ArrayList<node>[] A=new ArrayList[6];
        for (int i = 0; i < A.length; i++) {
        A[i]=new ArrayList();    
        }
        
        node n=new node(1,"a");
        A[0].add(n);
        
        n=new node(3,"b");
        A[0].add(n);
     n=new node(5,"");
        A[0].add(n);
//        n=new node(3,"");
//        A[0].add(n);
        n=new node(0,"a");
        A[1].add(n);
        
         n=new node(2,"b");
        A[1].add(n);
        
      //   n=new node(3,"a");
      //  A[1].add(n);
//        n=new node(3,"");
//        A[1].add(n);
//    
         n=new node(3,"a");
        A[2].add(n);
         n=new node(1,"b");
        A[2].add(n);
        n=new node(2,"a");
        A[3].add(n);
        
         n=new node(0,"b");
        A[3].add(n);
         n=new node(0,"");
        A[4].add(n); 
//        
        
   int state=4;
        ArrayList<node>[] list=new ArrayList[state+2];
        int is[]={0,1};
        int fs[]={3,2};
        
        
        for (int i = 0; i < list.length; i++) {
            list[i]=new ArrayList();
        }
        
        list[0].add(new node(1,"a"));
        list[0].add(new node(2,"b"));
        list[1].add(new node(1,"a"));
        list[1].add(new node(1,"b"));
        list[1].add(new node(3,"a"));
        list[2].add(new node(2,"a"));
        list[2].add(new node(2,"b"));
        list[2].add(new node(3,"b"));
        
        for (int i = 0; i < IS.length; i++) {
            list[list.length-2].add(new node(IS[i],""));
        }
        
        for (int i = 0; i < FS.length; i++) {
            list[FS[i]].add(new node(list.length-1,""));
        }            
   NFA h=new NFA(A,IS,FS);
//for (int i = 0; i < A.length; i++) {
    //    System.out.println(A[i]);    
       // }
        
        h.reduce();
        
       
        String s=h.Elimination();
        
    
  
for (int i = 0; i < list.length; i++) {
        System.out.println(list[i]);   
  
        }

System.out.println("\nREGULAR EXPRESSION OF T.G IS "+s+"\n");
    }
    
}
