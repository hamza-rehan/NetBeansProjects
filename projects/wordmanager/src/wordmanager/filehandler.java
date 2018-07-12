/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordmanager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hamza rehan
 */
public class filehandler {
    FileReader in;
    char [] word;
    final int MaxLen;
    final int EOF;
    public filehandler(String Path) throws FileNotFoundException,IOException{
        this.MaxLen=255;
        this.EOF=-1;
        this.in=new FileReader(Path);
        this.word=new char[MaxLen];
    }
    public String getWord() throws IOException{
        int n=0;
        int c = 0 ;
        
        while(!Character.isLetter(c) && c!=EOF){
          c=in.read();
        }
        if(c==EOF)return " ";
        word[n++]=(char) c;
        
        while (Character.isLetter(c=in.read()))
            if (n<MaxLen)
                word[n++]=(char) c;
        
        return new String(word, 0, n);
    }
}
