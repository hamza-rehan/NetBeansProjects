/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karachiroutes;

/**
 *
 * @author hamza rehan
 */
public class Graph {
    private final int INFINTY=100000;
     private final int maxvert=30;
    public vertex vertexlist[];
    private double adjmat[][];
    private int nverts;
    private int nTree;
    private distpar sPath[];
    private int currentvert;
    private double StartToCurrent;
    private double edgedistance[];
    private static int counter=0;
    public Graph(){
        this.vertexlist=new vertex[maxvert];
        this.edgedistance=new double[maxvert];
        adjmat=new double[maxvert][maxvert];
        nverts=0;
        for (int i = 0; i < maxvert; i++) {
            for (int j = 0; j < maxvert; j++) {
                adjmat[i][j]=INFINTY;
                sPath=new distpar[maxvert];
            }
        }
    }
    public void addvertex(String lab,int e){
        vertexlist[nverts++]=new vertex(lab,e);
    }
    public void addedge(int start,int end,double distance){
        adjmat[start][end]=distance;
        adjmat[end][start]=distance;
        
    }
    public void path(){
        
       // vertexlist[0].isInTree=true;
        nTree=0;
        
        for (int i = 0; i < nverts; i++) {
            double tempDist=adjmat[0][i];
            sPath[i]=new distpar(0,tempDist);
            
        }
        while(nTree<nverts){
            int indexmin=getmin();
            double mindist=sPath[indexmin].distance;
            
            if(mindist == INFINTY){
                System.out.println("NOT REACHABLE VERTICES ");
                break;
            }
            else{
                currentvert=indexmin;
                StartToCurrent=sPath[indexmin].distance;
                
            }
           // vertexlist[currentvert].isInTree=true;
            nTree++;
            adjust_sPath();
        }
        
        displayPaths();
        nTree=0;
        for (int i = 0; i < nverts; i++) {
            //vertexlist[i].isInTree=false;
        }
    }
    
    public int getmin(){
        double minDist=INFINTY;
        int indexmin=0;
        for (int i = 0; i < nverts; i++) {
            if( sPath[i].distance<minDist){
                minDist=sPath[i].distance;
                indexmin=i;
            }
        }
        return indexmin;
    }
    
    public void adjust_sPath(){
        int column=1;
        while(column<nverts){
//            if(vertexlist[column].isInTree){
//                column++;
//                continue;
//            }
            
            double currentToFringe=adjmat[currentvert][column];
            double startToFringe=StartToCurrent+currentToFringe;
            double sPathDist=sPath[column].distance;
            
            if(startToFringe<sPathDist){
                sPath[column].parentVert=currentvert;
                sPath[column].distance=startToFringe;
            }
            column++;
        }
    }
    
    public void displayPaths(){
        for (int i = 0; i < nverts; i++) {
            System.out.println(vertexlist[i].getPlace()+"=");
            if(sPath[i].distance==INFINTY)
                System.out.println("inf");
                else
                System.out.println(sPath[i].distance);
            String parent=vertexlist[sPath[i].parentVert].getPlace();
            System.out.println("(" + parent + ")");
        }
        System.out.println("");
    }
    public void displayvertex(int v){
        System.out.println(vertexlist[v].getPlace());
        //System.out.println(edgedistance[v]);
    }
    
    public int getAdjunvisitedvertex(int v){
        for (int i = 0; i < nverts; i++) 
            if(adjmat[v][i]==1  ) // &&vertexlist[i].isInTree==false)
                return i;
            return -1;
    
    }
    
    public void dfs(){
        StackX thestack=new StackX(nverts);
        //vertexlist[0].isInTree=true;
        displayvertex(0);
        thestack.push(0);
        
        while(!thestack.isEmpty()){
            int v=getAdjunvisitedvertex(thestack.peek());
            if(v==-1)
                thestack.pop();
            else{
          //      vertexlist[v].isInTree=true;
                displayvertex(v);
                thestack.push(v);
            }
        }
//        for (int i = 0; i < nverts; i++) {
//            vertexlist[i].isInTree=false;
//        }
    }

}
