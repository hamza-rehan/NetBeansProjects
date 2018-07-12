/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author hamza rehan
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vwcar c1=new passotwagon();
        vwcar c2=new jetta();
        c1.stuff(17);
        c2.stuff(2*c1.getnumpersons());
        System.out.println("1: "+c1.getnumpersons()+" "+c2.getnumpersons());
        
        vwcar c3=new vwcar();
        c3.stuff(20);
        c1.unstuff(2);
        c3.transfer(c1, 1);
        System.out.println("2: "+c1.getnumpersons()+" "+c3.getnumpersons());
        
        c1=c2;
        c3=c1;
        c1.transfer(c3, 4);
        System.out.println("3: "+ c1.getnumpersons()+""+c3.getnumpersons());
        // TODO code application logic here
    }
    
}
