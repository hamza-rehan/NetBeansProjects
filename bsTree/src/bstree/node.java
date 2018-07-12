/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author hamza rehan
 */
public class node {
    private int idata;
    private double fdata;
    private node rightchild;
    private node leftchild;
    
    public node(){
        this.idata=5;
        
    }
    public  node(int id,double fd){
        this.idata=id;
        this.fdata=fd;
        this.leftchild=null;
        this.rightchild=null;
    }

    public int getIdata() {
        return idata;
    }

    public void setIdata(int idata,double fd) {
        this.idata = idata;
        this.fdata=fd;
    }

    public double getFdata() {
        return fdata;
    }

    public void setFdata(double fdata) {
        this.fdata = fdata;
    }

    public node getRightchild() {
        return rightchild;
    }

    public void setRightchild(node rightchild) {
        this.rightchild = rightchild;
    }

    public node getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(node leftchild) {
        this.leftchild = leftchild;
    }

    

    
    public void displayNode(){
        System.out.println(" "+this.idata+","+this.fdata);
    }
}
