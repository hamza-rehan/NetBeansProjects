/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg_tester;

import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class CFG_tester {
    
    /*
     
    
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the string to validate");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str+"$";
        CFG cfg=new CFG(str);
       if(cfg.validate())
            System.out.println("valid");
       else System.out.println("not valid");
    }
    
}
