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
public class tree {
    private node root;
    
    
    public tree(){
    this.root=null;
    
    }
    public node find(int id){
     node current=root;
     while(current.getIdata()!=id){
      if(id<current.getIdata()){
      current=current.getLeftchild();
      }
      else{
      current=current.getRightchild();
      }
      if(current==null)
          return null;
     
     
     }
     
    return current;
    }
    public void insert(node n){
        if(root==null){
        root=n;
        }
        else{
        node current=root;
        node parent;
        while(true){
        parent=current;
        if(n.getIdata()<current.getIdata()){
        current=current.getLeftchild();
        if(current==null){
            parent.setLeftchild(n);
            break;
        }
            
      }
      else{
       
        current=current.getRightchild();
        if(current==null){
            parent.setRightchild(n);
            break;
        }
      
      
      
        }
        
        }
    
    
        }    
    }
    public boolean delete(int id){
    node current=root;
    node parent=root;
    boolean isleftchild=true;
    while(current.getIdata()!=id){
        parent=current;
      if(id<current.getIdata()){
          isleftchild=true;
      current=current.getLeftchild();
      }
      else{
          isleftchild=false;
      current=current.getRightchild();
      }
      if(current==null)
           return false;
       
    }
    if(current.getLeftchild()==null && current.getRightchild()==null){
        if(current==root)
            root=null;
        else if(isleftchild)
            parent.setLeftchild(null);
        else
            parent.setRightchild(null);
    }
    else if(current.getLeftchild()==null || current.getRightchild()==null){
        if(current.getRightchild()==null){
            if(current==root)
                root=current.getLeftchild();
            else if(isleftchild)
                parent.setLeftchild(current.getLeftchild());
            else if(!isleftchild)
                parent.setRightchild(current.getLeftchild());
        }
        else if(current.getLeftchild()==null){
            if(current==root)
                root=current.getRightchild();
            else if(isleftchild)
                parent.setLeftchild(current.getRightchild());
            else if(!isleftchild)
                parent.setRightchild(current.getRightchild());
        }
        
    }
    else{
        node successor=getsuccessor(current);
        if(current==root)
            root=successor;
        else if(isleftchild)
            parent.setLeftchild(successor);
        else
            parent.setRightchild(successor);
        
        successor.setLeftchild(current.getLeftchild());
    }
    return true;
    
    }
    public void inorder(node localroot ){
        if(localroot!=null){
        inorder(localroot.getLeftchild());
            System.out.println(localroot.getIdata()+","+localroot.getFdata());
            inorder(localroot.getRightchild());
        
        }
        
    }
    public void preorder(node localroot){
     if(localroot!=null){
        System.out.println(localroot.getIdata()+","+localroot.getFdata());
         preorder(localroot.getLeftchild());
            
            preorder(localroot.getRightchild());
        
        }
    }
    public void postorder(node localroot){
     if(localroot!=null){
        postorder(localroot.getLeftchild());
         
            postorder(localroot.getRightchild());
           System.out.println(localroot.getIdata()+","+localroot.getFdata());
        }
    }
    private node getsuccessor(node delnode){
        node successorParent=delnode;
        node successor=delnode;
        node current=delnode.getRightchild();
        while(current!=null){
            successorParent=successor;
            successor=current;
            current=current.getLeftchild();
        }
        
        if(successor!=delnode.getRightchild()){
            successorParent.setLeftchild(successor.getRightchild());
            successor.setRightchild(delnode.getRightchild());
        }
        return successor;
    }
    
}
