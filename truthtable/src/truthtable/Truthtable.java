/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthtable;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class Truthtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of variables");
        int num=s.nextInt();
        System.out.println("Enter the operator");
        char c=s.next().charAt(0);
        table t= new table(num);
        t.DtoB();
        int no=(int)Math.pow(2,num);
        boolean arr[]=new boolean[no];
         boolean arr1[]=new boolean[no];
        t.operation(c);
        t.display();
       
        t.negatealpha(arr, 1);
        t.alpha(arr1,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]+" "+arr1[i]+ " " + "KB== "   + (arr1[i]&&arr[i]) );
            System.out.println();
           
        }
        
    
    
    }
}