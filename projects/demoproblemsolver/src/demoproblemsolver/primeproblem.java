/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproblemsolver;

import java.util.ArrayList;

/**
 *
 * @author hamza rehan
 */
public class primeproblem extends solver {
    int n;
    ArrayList<Integer> arr;
     
    
    @Override
    public void process(){
        n=Integer.valueOf(rawinput.get(0));
        arr=new ArrayList<Integer>();
    }

    /**
     *
 
 */
    @Override
    public void solve(){
        boolean seive[]=new boolean[n];
        
        for(int i=0;i<n;i++)
           seive[i]=false;
           for(int i=2;i<n;i++){
               if(seive[i]==false){
                   boolean flag=true;
                   for(int j=2;j<i/2;j++){
                       if(i%j==0){
                           flag=false;
                           break;
                       }
                   }
                   if (flag==true){
                      
                       
                       arr.add(i);
                   }
               }
               for(int j=i*2;j<n;j+=i)
                   seive[j]=true;
        }
        
        
    }
}
