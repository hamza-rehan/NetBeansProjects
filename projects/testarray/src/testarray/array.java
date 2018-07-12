/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author hamza rehan
 */
public class array implements Cloneable{
    private int[] anarray={1,2,3,4,5,6};
    private int value;
    private int length;
    public void increment(){
        for(int i=0;i<anarray.length;i++)
           
        
            ++anarray[i];
        value++;
        
    }

    @Override
    public String toString() {
        String Info="The array contains "+anarray.length+" numbers";
        for(int i=0;i<anarray.length;i++)
            Info +=anarray[i]+"";
        Info +=" and value is "+value;
        return Info;
         //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        array obj=new array();
        obj.length=this.anarray.length;
        obj.value=this.value;
        return obj;//To change body of generated methods, choose Tools | Templates.
    }
     
}
