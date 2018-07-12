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
public class StackX {
      private int maxsize;
    private int[] stackArray;
    private int top;
    
    public StackX(int size){
        maxsize=size;
        stackArray=new int[maxsize];
        top=-1;
    }
    public void push(int j){
        stackArray[++top]=j;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxsize-1;
    }
    public int size(){
        return top+1;
    }
    public int peekN(int n){
        return stackArray[n];
    }
    public void displayStack(String s){
        System.out.println(s);
        System.out.println("Stack (bottom --> top): ");
        for (int i = 0; i < size(); i++) {
            System.out.println(peekN(i));
            System.out.println(' ');
        }
        System.out.println("");
    }

}
