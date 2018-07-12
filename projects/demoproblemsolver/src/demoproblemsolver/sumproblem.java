/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproblemsolver;

/**
 *
 * @author hamza rehan
 */
public class sumproblem extends solver{
    int[] n;

    @Override
    public void process() {
        n=new int[rawinput.size() - 1];
        for(int i=0;i<n.length;i++)
            n[i]=Integer.valueOf(rawinput.get(i+1));
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void solve() {
        for(int i=0;i<n.length;i++){
            long a3=3;
            long b3=n[i]-(n[i]%3);
            long n3=n[i]/3;
            
            long a5=5;
            long b5=n[i]-(n[i]%5);
            long n5=n[i]/5;
            
            long a15=15;
            long b15=n[i]-(n[i]%15);
            long n15=n[i]/15;
            
            long s3=n3*((a3+b3)/2);
            long s5=n5*((a5+b5)/2);
            long s15=n15*((a15+b15)/2);
            
            long ans=(s3+s5)-s15;
            System.out.println(ans);
            
        }
        
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
