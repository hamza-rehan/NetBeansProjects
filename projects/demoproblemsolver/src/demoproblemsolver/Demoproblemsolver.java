/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproblemsolver;

import java.io.IOException;

/**
 *
 * @author hamza rehan
 */
public class Demoproblemsolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        sumproblem s=new sumproblem();
        s.readinput("D:\\sum.txt");
        s.process();
        s.solve();
        
        primeproblem p=new primeproblem();
        p.readinput("D:\\prime.txt");
        p.process();
        p.solve();
        
        Filewriter f=new Filewriter();
        f.writerf(p.arr);
       //f.writeInFIle(p.arr);
       //for(int i: p.arr)
           //f.writerf(p.arr);
// TODO code application logic here
    }
    
}
