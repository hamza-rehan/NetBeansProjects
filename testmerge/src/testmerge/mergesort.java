/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmerge;

/**
 *
 * @author hamza rehan
 */
public class mergesort {
    
    private int[] arr;
    int noi;
    
    
    

public mergesort(int d){
arr=new int[d];
noi=0;
}

public void divide(int arr[]){
    
    if (arr.length<=1){
        return;
        
        
    }else{
        int mid =arr.length/2;
        int[] left=new int[mid];
        int[] right=new int [arr.length-mid];
        for (int i = 0; i < mid; i++) {
            left[i]=arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            
            right[i-mid]=arr[i];
            
        }
  
        divide(left);
        divide(right);
        merge(left,right,arr);
    }
    
this.toString(arr);
}
void merge(int left[],int right[],int arr[]){
    int a=left.length;
    int b=right.length;
    int i=0,j=0,k=0;
    while(i<a && j<b){
        if(left[i]< right[j]){
            arr[k++]=left[i++];
            //k++;
            //i++;
        }else{
            arr[k++]=right[j++];
        //k++;
        //j++;
        }
    }
    while(j<b){
        arr[k++]=right[j++];
       
    }
    while(i<a){
        arr[k++]=left[i++];
   
    }
    
}

    
    public String toString(int arr[]) {
         for(int i=0;i<arr.length;i++){
             System.out.println("mergesort{" + "arr=" + arr[i] + '}');}
         return"";
    }


}