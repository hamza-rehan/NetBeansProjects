/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamzarehanb15101034;

import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class HamzaRehanB15101034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     node n;
     linkedlist arr[]=new linkedlist[5];
     n=new node(1,"a");
     linkedlist list=new linkedlist(n);
     n=new node(2,"b");
     list.insert(n);
//     n=new node(4,"b");
//     list.insert(n);
     arr[0]=list;
     n=new node(1,"a");
     linkedlist list1=new linkedlist(n);
     n=new node(1,"b");
     list1.insert(n);
     n=new node(3,"a");
     list1.insert(n);
     arr[1]=list1;
     n=new node(2,"a");
     linkedlist list2=new linkedlist(n);
     n=new node(2,"b");
     list2.insert(n);
     n=new node(3,"b");
     list2.insert(n);
     arr[2]=list2;
     n=new node(3,"b");
     linkedlist list3=new linkedlist(n);
     
     n=new node(3,"a");
     list3.insert(n);
     arr[3]=list3;
//     n=new node(3,"a");
//     linkedlist list4=new linkedlist(n);
//     n=new node(4,"b");
//     list4.insert(n);
//     arr[4]=list4;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i].show();
//        }
//     arr[0].show();
int FS[]={3};    
char ch[]={'a','b'};
NFA nfa=new NFA(5,0,FS,arr,ch);
Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE STRING TO VALIDATE");
String s=input.next();
if(nfa.checkInput(s)){
   if(nfa.validate(s)) 
            System.out.println("valid");
   else System.out.println("not valid");
      
    }
else System.out.println("NOT ALLOWED CHARACTERS");
    
    }
}
