/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filing;

import java.io.IOException;

/**
 *
 * @author hamza rehan
 */
public class Filing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        filereader fr=new filereader();
        fr.process();
        output o=new output();
        o.show();
        // TODO code application logic here
    }
    
}
