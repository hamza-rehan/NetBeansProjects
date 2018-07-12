/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orange;

/**
 *
 * @author hamza rehan
 */
public class Orange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        keenu myorange=new keenu();
        myorange.size=5;
        myorange.mass=2.5;
        myorange.price=100;
        double weight=myorange.calculateweight();
        System.out.println("MY KEENU'S INFO: SIZE "+myorange.size+" MASS IS "+myorange.mass+" GRAM AND RATE OF KEENU IN DOZEN IS "+myorange.price);
        
        
        double cost=myorange.calculatecost();
        System.out.println("MY KEENU'S COST IS "+myorange.calculatecost()+" RS");
        
        // TODO code application logic here
    }
    
}
