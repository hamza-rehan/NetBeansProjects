/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproblemsolver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hamza rehan
 */
public abstract class solver {
    protected ArrayList<String> rawinput;
    public void readinput(String path){
        try{
            rawinput=new ArrayList<String>();
            File f=new File(path);
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while((line=br.readLine())!=null){
                rawinput.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public abstract void process();
    
    public abstract void solve();
}
