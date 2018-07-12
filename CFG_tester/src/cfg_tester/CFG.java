/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg_tester;

/**
 *
 * @author hamza rehan
 */
public class CFG {
    static int index;
    String Input;
    public CFG(String input){
        this.Input=input;
        index=0;
    }
    
    
    boolean validate(){
        if(S() && Input.charAt(index)=='$')
        return true;
        else return false;
    }
    boolean S(){
        if(Input.charAt(index)=='a'){
            index++;
            if(X()){
                if(Input.charAt(index)=='b'){
                    index++;
                    return true;
                }
                    
            }
        }
        
    return false;
    }
    
    boolean X(){
        if(Input.charAt(index)=='a'){
            index++;
            if(X()){
                if(Input.charAt(index)=='b'){
                    index++;
                    return true;
                }
            }
        }
        else if(Input.charAt(index)=='b'){
            index++;
            if(Y()){
                if(Input.charAt(index)=='a'){
                    index++;
                    return true;
                }
                    
            }
        }
        return false;
    }
    boolean Y(){
        if(Input.charAt(index)=='b'){
            index++;
            if(Y()){
                if(Input.charAt(index)=='a'){
                    index++;
                    return true;
                }
            }
        }
        else return true;
        return false;
    }
}
