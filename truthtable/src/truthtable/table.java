/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthtable;

/**
 *
 * @author hamza rehan
 */
public class table {
      boolean[] arr;
    boolean[][] array;
    int noOfVariable;
    
    boolean[] answer;
    int row ;

    public table( int noOfVariable ) {
        arr = new boolean[(int) Math.pow(2, noOfVariable)];
        
        this.noOfVariable = noOfVariable;
        this.row = (int) Math.pow(2, noOfVariable);
        this.array = new boolean[noOfVariable][this.row];
        this.answer = new boolean[this.row];
        
    }
    
    public void DtoB(){
        
        for (int q = 0; q < row; q++) {
            String s = Integer.toBinaryString(q);
    while (s.length() != this.noOfVariable) {
        s = '0'+s;
    }
    this.toBoolean(s, q);
        }
    }
    
    public void toBoolean(String s ,int row){
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            if (c[i] == '1') {
                this.array[i][row] = true ;
            }
        }
    }
    
    public void operation(char operator){
        int i = 0;
        switch(operator){
            case '|':
        for (; i < this.row; i++) {
            for (int j = 0; j < this.noOfVariable ; j++) {
                arr[i] = arr[i]|this.array[j][i];
                
            }
            this.answer[i]=arr[i];
        }
            break;
                case '&':
                    for (int j = 0; j < arr.length; j++) {
            arr[j]=true;
        }
                     i=0;
        for (; i < this.row; i++) {
            for (int j = 0; j < this.noOfVariable ; j++) {
                arr[i] = arr[i]&this.array[j][i];
                
            }
            this.answer[i]=arr[i];
        }
            break;
}
    }
   public void negatealpha(boolean[] q ,int col){
        
       for (int i = 0; i < 4 ; i++) {
  
           if (array[col][i]==false)
           q[i]=true;
           else if(array[col][i]==true)
                     q[i]=false;
           }
             
  
       
        
    }
   public void alpha(boolean[] q,int col){
        for (int i = 0; i < q.length ; i++) {
  
           
           q[i]=array[col][i];
         
           }
      
   }
    
    public void display(){
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.noOfVariable ; j++) {
                System.out.print(this.array[j][i] + " , " ); 
            }
            System.out.println(this.answer[i]);
         
            System.out.println(" ");
        }
        
    }

}
