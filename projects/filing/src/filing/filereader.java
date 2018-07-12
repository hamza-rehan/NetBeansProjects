/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hamza rehan
 */
public class filereader {
        FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    
public filereader() throws FileNotFoundException, IOException{
    this.fr=new FileReader("D:/msg.txt");
    this.br=new BufferedReader(fr);
    this.fw=new FileWriter("out.txt");
    this.pw=new PrintWriter(fw);
}
public void process() throws IOException{
         // br=new BufferedReader(fr); 
        String c="";
        
        
    while((c=br.readLine())!=null){
        
      
        
        if(c.equals(br.readLine()))
            System.out.println(c);
        else
            System.out.println(br.readLine());
    }
    pw.close();
}
}
