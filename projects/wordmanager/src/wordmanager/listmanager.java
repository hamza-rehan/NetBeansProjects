/*a;...........;.0O
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordmanager;

/**
 *
 * @author hamza rehan
 */
public class listmanager {
    final static int MaxWords=90;
    public int numWords;
    String[] Wordlist;
    int [] frequency;
    listmanager(){
        String[] wordList=new String[MaxWords];
        int[] frequency=new int[MaxWords];
        this.numWords=0;
        for (int h=0;h<MaxWords;h++){
        frequency[h]=0;
        wordList[h]="";
       }
    }
    int binarySearch(String s){
        int lo=0;
        int hi=this.numWords -1;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int cmp=s.compareTo(this.Wordlist[mid]);
            if(cmp==0) return mid;
            if(cmp<0)hi=mid-1;
            else lo=mid+1;
        }
        for(int i = this.numWords - 1; i >= lo; i--)
        {
            this.Wordlist[i+1] = this.Wordlist[i];
            this.frequency[i+1] = this.frequency[i];
            this.frequency[i] = 0;
        }
        return lo;
    }
    boolean isFull(){
        boolean b=false;
        if(this.numWords<MaxWords)
            return false;
        return true;
    }
    void insert(String s,int idx){
        this.Wordlist[idx]=s;
    }
        void proceedToNext(){
            this.numWords ++;
        }    


}
