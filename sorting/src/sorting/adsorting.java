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
public class adsorting {
    private int[] arr;
   
    
    public int[] mergesort(int[] arr,int l,int r){
        if(l>r){
           int middle=(l+r)/2;
           mergesort(arr,l,middle);
           mergesort(arr,l,middle);
           merge(arr,l,middle,r);
        }
        return arr;
    }
    private void merge(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i]=arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i]=arr[m+1+i];
        }
        int i=0,j=0,k=0;
        
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    @Override
    public String toString() {
        return "adsorting{" + "arr=" + this.arr + '}';
    }
    
}
