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
public class vwcar {
    int numpersons=0;
    int getnumpersons(){
        return numpersons;
    }
    void stuff(int n){
        numpersons +=n;
    }
    void unstuff(int n){
        numpersons -=n;
    }
    void transfer(vwcar c,int n){
        c.stuff(n);
        unstuff(n);
    }
}
