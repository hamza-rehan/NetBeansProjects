/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.saddition;

import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class FASADDITION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char allowed[]={'a','b'};
       FA result1;
       int TT1[][]=new int[2][2];
//       TT1[0][0]=1;
//       TT1[0][1]=2;
//       TT1[1][0]=3;
//       TT1[1][1]=2;
//       TT1[2][0]=1;
//       TT1[2][1]=3;
//       TT1[3][0]=3;
//       TT1[3][1]=3;
//       int FS1[]={3};
       
TT1[0][0]=1;
       TT1[0][1]=0;
       TT1[1][0]=1;
       TT1[1][1]=0;
       int FS1[]={0,1};
      
     //  int FS1[]={3};
       int TT2[][]=new int[3][2];
       TT2[0][0]=1;
       TT2[0][1]=0;
       TT2[1][0]=1;
       TT2[1][1]=2;
       TT2[2][0]=2;
       TT2[2][1]=2;
       int FS2[]={2};
       
       int TT3[][]=new int[4][2];
       TT3[0][0]=1;
       TT3[0][1]=2;
       TT3[1][0]=3;
       TT3[1][1]=2;
       TT3[2][0]=1;
       TT3[2][1]=3;
       TT3[3][0]=3;
       TT3[3][1]=3;
       int FS3[]={3};
       
       FA dfa1=new FA(2,allowed,TT1,0,FS1);
        FA dfa2=new FA(3,allowed,TT2,0,FS2);
        FA dfa3=new FA(4,allowed,TT3,0,FS3);
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF OPERATION YOU WANT TO PERFORM BETWEEN FA'S");
        System.out.println("1.OR\n2.CONCATENATE\n3.CLOSURE\n4.COMPLEMENT\n5.INTERSECTION");
        int num=s.nextInt();
        switch(num){
            case 1:
              result1=    dfa1.addition(dfa1, dfa2);
              System.out.println(result1);
                System.out.println("ENTER THE STRING TO VALIDATE");
                s=new Scanner(System.in);
                String str=s.nextLine();
                if(result1.checkInput(str)==true){
              if(result1.validate(str))
        System.out.println("valid");
              else
                    System.out.println("NOT VALID");
                }
                else System.out.println("INVALID CHARACTERS!");
              break;
            case 2:
                result1= dfa1.concatenation(dfa1, dfa2);
        System.out.println(result1);
        System.out.println("ENTER THE STRING TO VALIDATE");
        s=new Scanner(System.in);         
        str=s.nextLine();
        if(result1.checkInput(str)==true){
              if(result1.validate(str))
        System.out.println("valid");
            else
                    System.out.println("NOT VALID");
        }
        else System.out.println("INVALID CHARACTERS!");
              break;
            case 3:
                result1=dfa1.closure(dfa2);
        System.out.println(result1);
        System.out.println("ENTER THE STRING TO VALIDATE");
        s=new Scanner(System.in);         
        
        str=s.nextLine();
        if(result1.checkInput(str)==true){
              if(result1.validate(str))
        System.out.println("valid");
            else
                    System.out.println("NOT VALID");
        }
        else System.out.println("INVALID CHARACTERS!");
              break;
            case 4:
                    result1=dfa1.complement(dfa3);
        System.out.println(result1);
        System.out.println("ENTER THE STRING TO VALIDATE");
        s=new Scanner(System.in);         
        str=s.nextLine();
        if(result1.checkInput(str)==true){
              if(result1.validate(str))
        System.out.println("valid");
              else
                    System.out.println("NOT VALID");
        }
        else System.out.println("INVALID CHARACTERS!");
            break;
            case 5:
                    result1=dfa1.intersection(dfa1,dfa2);
        System.out.println(result1);
System.out.println("ENTER THE STRING TO VALIDATE");
s=new Scanner(System.in);                 
str=s.nextLine();
if(result1.checkInput(str)==true){
              if(result1.validate(str))
        System.out.println("valid");
              else
                    System.out.println("NOT VALID");
}
else System.out.println("INVALID CHARACTERS!");
              break;
            default:
            break;
        }
        
//    
//       
//       result3= dfa1.complement(dfa2);
//        System.out.println(result3);
    
    }
    
}
