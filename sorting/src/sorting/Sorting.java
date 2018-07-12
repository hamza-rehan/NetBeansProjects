/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author hamza rehan
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[]={8,4,1,5,9,3};
        adsorting s=new adsorting();
       
        s.mergesort(arr, 8, 3);
        System.out.println(arr);
    }
    
}
