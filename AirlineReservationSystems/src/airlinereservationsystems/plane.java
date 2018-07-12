/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystems;

import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */

    public class plane {
    private String name;
    private int noofseat;   
      enum Class{ECONOMY,BUSINESS}
private  Class Classtype;
Scanner input=new Scanner(System.in);
    public plane(String name, int noofseat,Class Classtype) {
        this.name = name;
        this.noofseat = noofseat;
        this.Classtype=Classtype;
        
    }
    public void plane(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoofseat() {
        return noofseat;
    }

    public void setNoofseat(int noofseat) {
        this.noofseat = noofseat;
    }

    public Class getClasstype() {
        return Classtype;
    }

    public void setClasstype(Class Classtype) {
        this.Classtype = Classtype;
    }

    @Override
    public String toString() {
        return ""+"AIRBUS{" + "NAME:" + name + ", TOTALSEAT=" + noofseat + ", YOURCLASS=" + Classtype + '}'+""
                ;
    }
      
    
    }

