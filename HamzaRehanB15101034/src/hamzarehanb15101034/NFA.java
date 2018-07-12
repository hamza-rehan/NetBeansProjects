/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamzarehanb15101034;

import java.util.Stack;

/**
 *
 * @author hamza rehan
 */
public class NFA {
int noOfState;
    char[] inputChar;
    linkedlist[] list; 
    int IS;
    int[] FS;    
    node n;
        Stack states,character,temp;
    public NFA(int states,int IS,int[] FS,linkedlist[] a,char[] allowed){
        this.FS=FS;
        this.IS=IS;
        this.list=a;
        this.noOfState=states;
        this.inputChar=allowed;
        this.states=new Stack();
        this.character=new Stack();
        this.temp=new Stack();
    }
        public int transition(int ST,char ch){
        linkedlist l=list[ST];
        character.push(ch);
            int trans=getposition(ch);
        if(trans==0){
           trans= l.search(""+ch);
           
        }
        else if(trans==1){
            trans=l.search(""+ch);
        }
        n=new node(trans,""+ch);
                 
        return trans;
    }
    boolean validate(String input){
        int CS=IS;
        int i=-1;
       states.push(CS);
        boolean FScontainsCS = false;
        for(int j=0;j<input.length();j++){
        CS=transition(CS,input.charAt(j));
        states.push(CS);
            
        }
        for (int j = 0; j < FS.length; j++) {
            if(CS==FS[j])
                FScontainsCS=true;
        }
        if(!FScontainsCS){
                       
        if(backtrack(input,CS))
            FScontainsCS=true;
        }
        
        return FScontainsCS;
           }
    public int getposition(char ch){
        int position =0;
        for (int i = 0; i < inputChar.length; i++) {
            if(ch==inputChar[i])
                position=i;
        }
        return position;
    }
public boolean backtrack(String input,int C){
    boolean FScontainsCS=false;
    int CS,i=0;
    String matcher="";
    
    while(!states.isEmpty()){

   
    char c=(char)character.pop();
    matcher=c+matcher;
    i=(int)states.pop();    
    
    
    if(list[i].searchnext(""+c)==true){
       CS=list[i].temp;
       for(int j=0;j<matcher.length();j++){
        CS=transition(CS,matcher.charAt(j));
            
        }
        for (int j = 0; j < FS.length; j++) {
            if(CS==FS[j])
                FScontainsCS=true;
        }
    }
        if(FScontainsCS)
            break;
    }
    return FScontainsCS;
}
   
    public boolean checkInput(String input){
        int k=0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < inputChar.length; j++) {
                if (input.charAt(i)==inputChar[j]) {
                    k++;
                }
            }
        }
        if(k==input.length())
            return true;
        
        return false;
    }
}
