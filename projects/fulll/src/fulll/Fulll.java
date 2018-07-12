/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fulll;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hamza rehan
 */
public class Fulll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileWriter fw;
    BufferedWriter bw;
    PrintWriter out;
   
     fw=new FileWriter("msg.txt",true);
     bw=new BufferedWriter(fw);
     out=new PrintWriter(bw);
     
     
    

    
   
        out.printf("\nWORDS FREQUENCY\n\n");
        for(int h=0;h<10;h++)
           
        {
            out.printf("hello");
        }
        out.close();
    }
    
    
}
