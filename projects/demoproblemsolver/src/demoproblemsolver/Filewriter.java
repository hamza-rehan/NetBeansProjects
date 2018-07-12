/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproblemsolver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author hamza rehan
 */
public class Filewriter {
    
    File f;
    FileWriter fwr;
    BufferedWriter b;
    PrintWriter pw;
    Filewriter()
    {
        try{
            this.f=new File("primenum.txt");
        this.fwr=new FileWriter(f);
        this.b=new BufferedWriter(fwr);
        this.pw=new PrintWriter(b);
        }
        catch(IOException e)
        {
            System.out.println("erreor");
        }
    }
    
    public void writerf(ArrayList<Integer> arrr){
     
        
            
        
            pw.print(arrr);
        
        pw.close();
    }
    
}
