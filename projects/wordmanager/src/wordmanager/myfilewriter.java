/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordmanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author hamza rehan
 */

public class myfilewriter {
    FileWriter fw;
    PrintWriter out;
    File f;
BufferedWriter bw;
    public myfilewriter() throws IOException {
     //   this.f = new FileWriter("hamza.txt");
        this.fw=new FileWriter("hamza.txt");
     //   this.bw=new BufferedWriter(fw);
        this.out = new PrintWriter(fw);
    }
    
    void show(listmanager l) throws IOException
    {
        out.println("\nWords Frequency\n\n");
        for (int h = 0; h < l.Wordlist.length; h++)
        {
            out.printf("%-20s %2d\n", l.Wordlist[h], l.frequency[h]);
        }
        
        //file closing
        out.close();
        
    }
    
    
    
    
    
}
