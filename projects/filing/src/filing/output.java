/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hamza rehan
 */
public class output {
  FileWriter fw;
  PrintWriter pw;
  public output() throws IOException{
      this.fw=new FileWriter("file.txt");
      this.pw=new PrintWriter(fw);
  }
    public void show(){
        
        pw.println();
    }
    
}
