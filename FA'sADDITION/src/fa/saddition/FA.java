/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.saddition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author hamza rehan
 */
public class FA {
    int noOfState;
    char[] inputChar;
    int[][] TT; 
    int IS;
    int[] FS;
    ArrayList<states> list=new ArrayList();
    public FA(int S, char[] IC, int[][] TT, int IS, int[] FS){
        this.FS = FS;
        this.IS = IS;
        this.TT = TT;
        this.inputChar = IC;
        this.noOfState = S;
    }
    public int transition(int ST,char ch){
        int trans=getposition(ch);
        return TT[ST][trans];
    }
    
    boolean validate(String input){
        int CS=IS;
       
        boolean FScontainsCS = false;
        for(int j=0;j<input.length();j++){
        CS=transition(CS,input.charAt(j));
        }
        for (int j = 0; j < FS.length; j++) {
            if(CS==FS[j])
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
    public FA addition(FA dfa1,FA dfa2){
        int X,Y,T=0;
        
        ArrayList Int=new ArrayList(); 
        
        boolean status=false;
        
        states s=new states(dfa1.IS,dfa2.IS);
        list.add(s);
        for(int j=0;j<list.size();j++){
        for (int i = 0; i < dfa1.inputChar.length; i++) {
            X=dfa1.transition(list.get(j).x,inputChar[i]);
            Y=dfa2.transition(list.get(j).y,inputChar[i]);
            s=new states(X,Y);
            status=false;
            for (int k = 0; k < list.size(); k++) {
                if(list.get(k).x==s.x && list.get(k).y==s.y){
                   status=true;
                   Int.add(k);
                    break;
            }
            }    
                if(!status){
                    list.add(s);
                    Int.add(list.size()-1);
            }
        }
        }
        ////////////////////////////////////////////////////////////////////////
        int[][] TT=new int[list.size()][inputChar.length];
        for (int i = 0; i < list.size(); i++) {
            System.out.println("X"+list.get(i).x+" OR Y"+list.get(i).y);
        }
      //////////////////////////////////////////////////////////////////////////  
        for (int j = 0; j < list.size(); j++) {
        for (int i = 0; i < inputChar.length; i++) {
            
            TT[j][i]=(int)Int.get(T++);
        }    
      }
       Int.clear();
       /////////////////////////////////////////////////////////////////////////
       for(int j=0;j<list.size();j++){
        for (int i = 0; i < dfa1.FS.length; i++) {
            if(list.get(j).x==dfa1.FS[i])
                if(!Int.contains(j))
            Int.add(j);
        }
        }
        for(int j=0;j<list.size();j++){
        for (int i = 0; i < dfa2.FS.length; i++) {
            if(list.get(j).y==dfa2.FS[i])
                if(!Int.contains(j))
            Int.add(j);
        }
        }


        int[] n=new int[Int.size()];
        for (int i = 0; i < Int.size(); i++) {
            n[i]=(int)Int.get(i);
        }
        Arrays.sort(n);
        int[] FS1=n;
        ////////////////////////////////////////////////////////////////////////

       FA DFA=new FA(list.size(),dfa1.inputChar,TT,0,FS1);
       list.clear();
       return DFA;
    }
    
    public FA concatenation(FA dfa1,FA dfa2){
        int X,T=0;
        ArrayList Y;
        ArrayList Int=new ArrayList(); 
        
        boolean status;
        
        states s=new states(dfa1.IS,new ArrayList());

        list.add(s);
        for(int j=0;j<list.size();j++){
            
        for (int i = 0; i < dfa1.inputChar.length; i++) {
            X=dfa1.transition(list.get(j).x,inputChar[i]);
            Y=new ArrayList();
            for (int k = 0; k < dfa1.FS.length; k++) {
                if(X==dfa1.FS[k]){
                    Y.add(dfa2.IS);
                }
            }
//            
            for (int k = 0; k < list.get(j).Y.size(); k++) {
                               
                int y=dfa2.transition((int)list.get(j).Y.get(k),inputChar[i]);
                if(!Y.contains(y))
                Y.add(y);
            
            }
//            
            s=new states(X,Y);
            status=false;
            for (int k = 0; k < list.size(); k++) {
                if(list.get(k).x==s.x && list.get(k).Y.equals(s.Y)){
                   status=true;
                   Int.add(k);
                    break;
            }
            }    
                if(!status){
                    list.add(s);
                    Int.add(list.size()-1);
            }
        }
        }
        ////////////////////////////////////////////////////////////////////////
        int[][] TT=new int[list.size()][inputChar.length];
        for (int i = 0; i < list.size(); i++) {
            System.out.println("X"+list.get(i).x+" OR Y"+list.get(i).Y);
        }
    ////////////////////////////////////////////////////////////////////////////
        for (int j = 0; j < list.size(); j++) {
        for (int i = 0; i < inputChar.length; i++) {
            
            TT[j][i]=(int)Int.get(T++);
        }    
        }
        ////////////////////////////////////////////////////////////////////////
       Int.clear();
//       for(int j=0;j<list.size();j++){
//        for (int i = 0; i < dfa1.FS.length; i++) {
//            if(list.get(j).x==dfa1.FS[i])
//                if(!Int.contains(j))
//            Int.add(j);
//        }
//        }
        for(int j=0;j<list.size();j++){
        for (int i = 0; i < dfa2.FS.length; i++) {
            if(list.get(j).Y.contains(dfa2.FS[i]))
                if(!Int.contains(j))
            Int.add(j);
        }
        }


        int[] n=new int[Int.size()];
        for (int i = 0; i < Int.size(); i++) {
            n[i]=(int)Int.get(i);
        }
        Arrays.sort(n);
        int[] FS1=n;
////////////////////////////////////////////////////////////////////////////////
        FA dfa=new FA(list.size(),dfa1.inputChar,TT,0,FS1);
        return dfa;
    }
    
    public FA closure(FA dfa1){
        int X,temp=0;
        ArrayList<ArrayList> Y=new ArrayList();
        ArrayList Int=new ArrayList(); 
        for (int i = 0; i < dfa1.FS.length; i++) {
            if(dfa1.FS[i]==0){
                temp=0;
            break;}
            else temp=1;
        }
        boolean status;
        ArrayList<Integer> x=new ArrayList();
        states s=new states(dfa1.IS,new ArrayList());
        x.add(dfa1.IS);
        Y.add(x);
       // list.add(s);
        for(int j=0;j<Y.size();j++){
            
        for (int i = 0; i < dfa1.inputChar.length; i++) {
            x=new ArrayList();
            for (int T = 0; T < Y.get(j).size(); T++) {
                
            
            X=dfa1.transition((int)Y.get(j).get(T),inputChar[i]);
            if(!x.contains(X)){
            x.add(X);
            }
            
            for (int k = 0; k < dfa1.FS.length; k++) {
                if(X==dfa1.FS[k] && !x.contains(dfa1.IS)){
                    x.add(dfa1.IS);
                }
            }
//            
//            for (int k = 0; k < list.get(j).Y.size(); k++) {
//                               
//                int y=dfa1.transition(Y[j].get(j),inputChar[i]);
//                if(!Y.contains(y))
//                Y.add(y);
//               
//                
//            }
//            
            
            
        }
            status=false;
            for (int k = temp; k <Y.size(); k++) {
                if(Y.get(k).equals(x)){
                   status=true;
                   Int.add(k);
                    break;
            }
            }    
                if(!status){
                    Y.add(x);
                    Int.add(Y.size()-1);
            }
        }
        }
        ////////////////////////////////////////////////////////////////////////
        int[][] TT=new int[Y.size()][inputChar.length];
        for (int i = 0; i < Y.size(); i++) {
            System.out.println("X"+Y.get(i));
        }
        int t=0;
        for (int j = 0; j < Y.size(); j++) {
        for (int i = 0; i < inputChar.length; i++) {
            
            TT[j][i]=(int)Int.get(t++);
       }
        }
               ////////////////////////////////////////////////////////////////////////
       Int.clear();
       
       
        for (int i = 0; i < dfa1.FS.length; i++) {
            if(dfa1.FS[i]==0){
                Int.add(0);
                break;
            }
            
        }
        if(!Int.contains(0))
            Int.add(0);
        for(int j=0;j<Y.size();j++){
        for (int i = 0; i < dfa1.FS.length; i++) {
            if(Y.get(j).contains(dfa1.FS[i]))
                if(!Int.contains(j))
            Int.add(j);
        }
        }


        int[] n=new int[Int.size()];
        for (int i = 0; i < Int.size(); i++) {
            n[i]=(int)Int.get(i);
        }
        Arrays.sort(n);
        int[] FS1=n;
////////////////////////////////////////////////////////////////////////////////

        FA dfa=new FA(Y.size(),dfa1.inputChar,TT,0,FS1);
        return dfa;
    }
    
    public FA complement(FA dfa){
        ArrayList<Integer> A=new ArrayList();
        for (int j = 0; j < dfa.FS.length; j++) {
            A.add(dfa.FS[j]);
        }
        int k=0;
       dfa.FS=new int[dfa.noOfState-dfa.FS.length];
        for (int i = 0; i < dfa.noOfState; i++) {
            if(!A.contains(i))
                dfa.FS[k++]=i;
        }
       
        FA dfa1=new FA(dfa.noOfState,dfa.inputChar,dfa.TT,dfa.IS,dfa.FS);
        return dfa1;
    }
    
   public FA intersection(FA dfa1,FA dfa2){
       FA result;
       dfa1=dfa1.complement(dfa1);
       dfa2=dfa2.complement(dfa2);
       result=this.addition(dfa1, dfa2);
       result=this.complement(result);
       return result;
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

    @Override
    public String toString() {
        System.out.println("NO. OF STATES : "+noOfState);
        System.out.println("INITIAL STATE : "+IS);
        System.out.println("TRANSITION TABLE :");
        for (int i = 0; i < TT.length; i++) {
            for (int j = 0; j < inputChar.length; j++) {
                System.out.print(TT[i][j]+" ");        
            }
            System.out.println("");
        }
        System.out.println("FINAL STATES :");;
        for (int i = 0; i < FS.length; i++) {
            System.out.println(FS[i]);
        }
        
        return "";
    
        }
    

}
