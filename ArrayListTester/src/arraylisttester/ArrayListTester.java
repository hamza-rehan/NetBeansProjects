/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttester;
import java.util.*;
/**
 *
 * @author ShariQ
 */
public class ArrayListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* ArrayList<Tr[]> obj=new ArrayList();
        Tr mytr1=new Tr(2,"a");
        Tr mytr2=new Tr(2,"a");
        
        
        for (int i = 0; i < obj.size(); i++) {
            System.out.println();    
        }
        */
        /*Scanner scan=new Scanner(System.in);
        // Put the length of the array you need
        ArrayList<Tr>[] group = new ArrayList[3];
        for (int x = 0; x < group.length; x++) {
            group[x] = new ArrayList<>();
        }
        
        for (int i = 0; i < 3; i++) {
            while(true){
            int state=scan.nextInt();
            if(state==-1)
                break;
            String ch=scan.nextLine();
            Tr mytr1=new Tr(state,ch);
            group[0].add(mytr1);
        }
        }
         */
        int nos=4;
        char [] ic={'a','b'};
        int is=0;
        int[] fs={2};
        
        ArrayList[][] table=new ArrayList [nos][ic.length];
        
        for (int i = 0; i < nos; i++) {
            for (int j = 0; j < ic.length; j++) {
                table[i][j]=new ArrayList<Integer>();
            }
        }
        
        table[0][0].add(1);
        table[0][0].add(3);
        table[0][1].add(2);
        table[1][0].add(2);
        table[2][0].add(2);
        table[2][1].add(2);
        table[3][0].add(3);
        table[3][1].add(3);
       /* 
        table[0][0].add(0);
        table[0][0].add(1);
        //table[0][1].add(2);
        table[1][0].add(1);
        table[1][1].add(2);
        table[2][0].add(2);
        table[2][1].add(2);
        /*
        table[0][0].add(1);
        table[0][0].add(3);
        table[0][1].add(2);
        table[1][0].add(2);
        table[2][0].add(2);
        table[2][1].add(2);
        table[2][1].add(3);
        table[0][0].add(1);
        table[3][1].add(1);
        table[3][1].add(2);
        table[4][0].add(3);
        table[4][1].add(4);
        */
        System.out.println("Enter String that start with 'a':");
        Scanner scan=new Scanner(System.in);
        String myinput=scan.nextLine();
        NFS mynfs=new NFS(nos,ic,table,is,fs);
        boolean b=mynfs.validate(myinput);
        System.out.println(b);
      /*  for (int i = 0; i < nos; i++) {
            for (int j = 0; j < ic.length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
       */ 
       
    }
    
}
