/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttester;
import java.util.*;
/**
 *
 * @author ShariQ
 */
public class NFS {
        int no_of_states;
        char[] input;   
        ArrayList[][] tt;
        
        int is;
        int[] fs;
        LinkedList<Integer> stack = new LinkedList<>();
    
    public NFS(int s,char[] ic,ArrayList[][] tt,int is,int[] fs){
        this.no_of_states=s;
        this.input=ic;
        this.tt=tt;
        this.is=is;
        this.fs=fs;
    }
     
    public boolean validate(String word){
        int cs=is;
        int i=0;
        
        while(true){
        while(i<word.length()){
            cs=transition(cs,word.charAt(i));
            if(cs==-2){
                return false;
            }
            i++;
        if(i==word.length()-1){
            for (int j = 0; j < fs.length; j++) {
                    if(cs==fs[j])
                        return true;
                  else {
                        if(stack.isEmpty())
                            return false;
                    }
                }
            i--;
            cs=stack.removeFirst();
            }
             
        }
        return false;
    }
    }
    public int transition(int st,char ch){
        
        
        ArrayList ss;
        for (int i = 0; i < input.length; i++) {
            if(ch==input[i]){
                ss=tt[st][i];
                if(ss.size()==0){
                    if(stack.isEmpty()){
                        return -2;
                    }else
                        return (stack.removeFirst());
                }
                else{
                for (int j = 0; j < ss.size(); j++) {
                    int s=(int)ss.get(j);
                    stack.addFirst(s);
                }
                return (stack.removeFirst());
            }
            }
        }
        
        return(-2);
}    
}