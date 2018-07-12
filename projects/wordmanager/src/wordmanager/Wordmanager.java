 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordmanager;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author hamza rehan
 */
public class Wordmanager {
    static String path="./src/wordmanager/passage.txt";
    

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        int loc;
        filehandler f=new filehandler(path);
        String word=f.getWord().toLowerCase();
        //System.out.println(word);
        
        listmanager mList=new listmanager();
       boolean isSpace=word.equals(" ");
        while(!isSpace){
             loc= mList.binarySearch(word);
            try{
            if(word.compareTo(mList.Wordlist[loc])==0) {
                mList.frequency[loc]++;
            }
                
                else
                if(!mList.isFull()){
                    mList.insert(word, loc);
                    mList.frequency[loc]++;
                    mList.proceedToNext();
                }
                        
                   }
            
            catch(NullPointerException e){};
            word=f.getWord().toLowerCase();
            isSpace=word.equals("");
        }
        myfilewriter mfw;
        mfw = new myfilewriter();
        
            
        
        mfw.show(mList);
        
        
        // TODO code application logic here
            }
}
    

