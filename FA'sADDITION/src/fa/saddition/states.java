/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.saddition;

import java.util.ArrayList;

/**
 *
 * @author hamza rehan
 */
public class states {
    int x,y;
    ArrayList Y;
    public states(int x,int y){
        this.x=x;
        this.y=y;
    }
    public states(int x,ArrayList y){
        this.x=x;
        this.Y=y;
    }
}
