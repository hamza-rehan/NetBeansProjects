/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrationalnumber;

/**
 *
 * @author hamza rehan
 */
public class integers extends RationalNumber{
    int sign;
    public integers(){
        super(-5,1);
        
        this.sign=0;
      
        if(super.getNumerator()>=sign)
            System.out.println("+");
        else
            System.out.println("-");
    }
    }
    
