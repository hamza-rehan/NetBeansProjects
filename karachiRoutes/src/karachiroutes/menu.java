/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karachiroutes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author hamza rehan
 */
public class menu {
    String c,d,source,destination,status="";
    int i=0,j,n,sd;
    File f1=new File("D:\\ROUTE.txt");
    int l=0, edge;
    Scanner input,so,de;
    vertex[] vert=new vertex[100];
    vertex[] verts=new vertex[100];
    vertex v;
    Graph g1=new Graph();
    public void menu() throws FileNotFoundException {
    FileReader fr=new FileReader(f1);    
//        g1.addvertex("GULSHAN");
//        g1.addvertex("GULSHAN E HADEED");
//        g1.addvertex("GULSHAN E MAYMAR");
//        g1.addvertex("GULISTAN E JOUHAR");
//        g1.addvertex("MALIR");
//        g1.addedge(0, 1,54);
//        g1.addedge(0, 3,54);
//        g1.addedge(1, 2,35);
//        g1.addedge(2, 3,12);
//        g1.addedge(3, 4,120);
//        g1.addedge(2, 4,12);
//        
        System.out.println();
        System.out.println("\t\t\t=====================================================");
        System.out.println("\t\t\t\t***********THE TRAVELERS**********");
        System.out.println("\t\t\t\t======WELCOME WHERE YOU FEEL COMFORT=======");
        System.out.println("\t\t\t=====================================================");
   so=new Scanner(f1);
   
        input=new Scanner(System.in);
            
       System.out.println("ENTER YOUR LOCATION PLEASE ");
        c=input.next().toUpperCase();
        node n1=new node(c,0);
        linkedlist list=new linkedlist();
        list.insert(n1);
        System.out.println("WHERE DO YOU WANT TO GO ??");
        d=input.next().toUpperCase();
        node n2=new node(d,0);
        list.insert(n2);
        list.show();
        this.search(c);
        if(status.equals("found")){
            System.out.print(c+" ---> "+ d + " WITH DISTANCE "+edge+" KM");
        }
        else if(!status.equals("found")){
        for (int k = 0; k < sd; k++) {
            this.search(vert[k].getPlace());
            if(status.equals("found")){
                edge=edge+vert[k].getEdge();
                System.out.println(c+" ---> "+vert[k].getPlace()+" ---> "+d+" WITH DISTANCE "+edge+" KM");
                break;
            }
        }
        }
            
        
        if(!status.equals("found")){
            this.find(d);
            for (int k = 0; k < sd; k++) {
                
        
                for (int m = 0; m < n; m++) {
                 if(status.equals("found")){
                edge=edge+vert[m].getEdge();
                //this.check(vert[k].getPlace(),verts[m].getPlace());
                
            if(this.check(vert[k].getPlace(),verts[0].getPlace())==true){
                edge=edge+verts[0].getEdge();
                System.out.println(c+" ---> "+vert[k].getPlace()+" ---> "+verts[m].getPlace()+" ---> "+d+" WITH DISTANCE "+edge+" KM");
                
               
            }
    }   
                }
            
        }
        }
//                        //g1.dfs();
//                       // g1.path();
//                    }
//                   
//    }
//        }
//        
////        for ( i = 0; i < g1.vertexlist.length; i++) {
////            if(c.equals(g1.vertexlist[i].place)){
////            break;
////        }
////        }
////        for ( j = 0; j < g1.vertexlist.length; j++) {
////            if(d.equals(g1.vertexlist[j].place)){
////            break;
////        }
////        }
////        System.out.println("SHORTEST PATHS");
//       // g1.path();
//            //g1.dfs();
        }
    public void search(String a) throws FileNotFoundException{
        Scanner rem=new Scanner(f1);
        
        while(rem.hasNext()){
        String temp=rem.next();
        int no;
        
        
                  if(temp.equals("SOURCE")){
                      temp=rem.next();
                      
                    if(a.equals(temp)){
                        
                         no=rem.nextInt();
                         if(c.equals(temp))
                         sd=no;
                         g1.addvertex(temp,no);
                         n=no;
                            int j=l;
                        for (int k = l; k < no+j; k++) {
                            
                            
                            destination=rem.next();
                            edge=rem.nextInt();
                            if(d.equals(destination)){
                                status="found";
                                   l++;
                               break;
                            }
                            else{
                                
                                v=new vertex(destination,edge);
                                vert[k]=v;
                                l++;
                             //   status="notfound";
                            }
                            
//                            else{
//                           g1.addvertex(destination);
//                           g1.addedge(l, j, ed);
//                           //System.out.println(destination+" = "+ed);
//                            
//                        }
                        }
                       
                    }
                    
                  }
                  
        }
        
    }
    
    public void find(String a)throws FileNotFoundException{
        Scanner rem=new Scanner(f1);
        
        while(rem.hasNext()){
        String temp=rem.next();
        int no;
        
        
                  if(temp.equals("SOURCE")){
                      temp=rem.next();
                    if(a.equals(temp)){
                        
                         no=rem.nextInt();
                         
                         g1.addvertex(temp,no);
                         n=no;
                            int j=i;
                        for (int k = i; k < no+j; k++) {
                            
                            
                            destination=rem.next();
                            edge=rem.nextInt();
                            for (int m = 0; m < 15; m++) {
                            if(vert[m].getPlace().equals(destination)){
                                status="found";
                                   v=new vertex(destination,edge);
                                verts[i]=v;
                               i++;
                            }
                            
                            }
                            
//                            else{
//                                
//                                v=new vertex(destination,edge);
//                                verts[k]=v;
//                                i++;
//                             //   status="notfound";
//                            }
                            
//                            else{
//                           g1.addvertex(destination);
//                           g1.addedge(l, j, ed);
//                           //System.out.println(destination+" = "+ed);
//                            
//                        }
                        }
                       
                    }
                    
                  }
        }
    }
    
    public boolean check(String a,String b) throws FileNotFoundException{
      Scanner temp=new Scanner(f1);
      String tempst=status;
      while(temp.hasNext()){
          String s=temp.next();
      int no;
          if(s.equals("SOURCE")){
                      s=temp.next();
                    if(a.equals(s)){
                        
                         no=temp.nextInt();
                         
                         g1.addvertex(s,no);
                         
                        for (int k = 0; k < no; k++) {
                            
                            
                            destination=temp.next();
                            edge=temp.nextInt();
                            
                            if(b.equals(destination)){
                                status="found";
                            break;
                            
                            }
                            else{
                                status="not";
                            }
      }
      
    }
          }
      }
      if(status.equals("found"))
          return true;
      else{
          status=tempst;
          return false;
      }
    }
}

      