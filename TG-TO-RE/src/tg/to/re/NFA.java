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
public class NFA {
int noOfState;
    char[] inputChar;
    ArrayList<node>[] list; 
    int[] IS;
    int[] FS;    
    node n;
        
    public NFA(ArrayList<node>[] a,int[] IS,int[] FS){
        this.FS=FS;
        this.IS=IS;
        this.list=a;
        
    }
       
    
    
    public void reduce(){
       String save="";
        for (int k = 0; k < list.length-1; k++) {
        int q=list[k].size();   
        
            for (int i = 0; i <q ; i++) {
                for (int j = i+1; j < list[k].size(); j++) {
                    if(list[k].get(i).i==list[k].get(j).i){
                     if(list[k].get(i).s.equals(""))
                         save=list[k].get(j).s;
                     else if(list[k].get(j).s.equals(""))
                         save=list[k].get(i).s;
                     else
                        save="("+list[k].get(i).s+"+"+list[k].get(j).s+")";
                        n=new node(list[k].get(i).i,save);
                        list[k].remove(j);
                        list[k].remove(i);
                    
                        list[k].add(n);
                    }
                }   
            }
            
        }
        
    }
   public String Elimination(){
        for (int i = 0; i < list.length-2; i++) {
  this.eliminate(i);
 reduce();
  list[i].clear();
  
           
        }
  return list[list.length-2].get(0).s;
    }
    
    public void eliminate(int r){
        
        node n;
    String temp="";
    String loop=loop(r);
        for (int j = 0; j < list.length-1; j++) {
            int q=list[j].size();
            for (int k = 0; k < q; k++) {
           
                if(j==r) 
              k=list[j].size();
            else if(list[j].get(k).i==r){
               
                for (int l = 0; l < list[r].size(); l++) {
                     temp=list[j].get(k).s;
                    int t=list[r].get(l).i;
                    temp=temp+loop+list[r].get(l).s;
                    
                    n=new node(t,temp);
                    list[j].add(n);
                   
                }
                 list[j].remove(k);
            }
               
        }
    }       
        
        }
    
   
    
    public String loop(int st){
        String temp="";
        for (int i = 0; i < list[st].size(); i++) {
            if(list[st].get(i).i==st){
                temp=list[st].get(i).s+"*";
                list[st].remove(i);
            }
        }
    return temp;
    
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
