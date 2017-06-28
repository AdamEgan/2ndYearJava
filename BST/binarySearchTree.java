m/**
*This is a Node class Which represents a node in the graph which has a left and right child.
*@author:(Adam Egan)(115359356)
*/
class Node<T extends Comparable<T>>{
    public T data;
    Node<T> leftchild;
    Node<T> rightchild;

   /**
   *Constructor which initialises data in the Node
   */
   public Node(T data){
        this.data=data;
   
    }
    public String toString(){
      return ""+data;
    
    }

}

/**
*This is a BinarySearch Tree  class which keeps the structure of the tree in place.
*@author:(Adam Egan)(115359356)
*/
public class binarySearchTree<T extends Comparable<T>>{
    Node<T> root;
    
    public binarySearchTree(){
         this.root=null;
    }
   /**
   *Method to insert  a node into the right place in the graph
   *If the data is less than the root then it will place in the leftchild
   *else if the data is greater than the root then it will go into the rightchilder>(
   */
   public void insert(T data){
          this.root=insert(this.root,data);
  
   }
   /**
   *Helper method for insert which does all the comparing and inserting 
   */
   private Node<T> insert(Node<T> node,T data){
         if(node==null){
             node=new Node<T>(data);
         }
         else{
             if(data.compareTo(node.data)<=0){
                 node.leftchild=insert(node.leftchild,data);
             
             }
             else{
                 node.rightchild = insert(node.rightchild,data);
             }
          
         }
           return node;
   }
   /**
   *InOrder print of the Tree prints leftchild first
   */
  public void showinOrder(){
          inOrderTraverseTree(this.root);
  }
  /**
  *Helper Function for inorder adds indentation if node is the root if not dont indent
  */
  private void inOrderTraverseTree(Node<T> node) {
        String indent="";
        if(node==this.root){indent="";}else{indent=" ";}
        if (node != null) {
            inOrderTraverseTree(node.leftchild);
            System.out.println(indent+node);
            inOrderTraverseTree(node.rightchild);
        }
    }
   /**
   *PreOrder print of the Tree prints root node first
   */
   public void showpreOrder(){
       preorderTraverseTree(this.root);
   
   }
   /**
   *Helper Function for preorder adds indentation if node is the root if not dont indent
   */
    private void preorderTraverseTree(Node<T> node) {
        String indent=" ";
        if (node != null) {
            if(node==this.root){
                 indent="";
            }
            else{indent=" ";}
            System.out.println(indent+node);
            preorderTraverseTree(node.leftchild);
            preorderTraverseTree(node.rightchild);
            indent=" ";
        }
    }
    
   /**
   *PostOrder print of the Tree prints right node first
   */
    public void showpostOrder(){
        postOrderTraverseTree(this.root);
    }
    /**
    *Helper Function for postorder adds indentation if node is the root if not dont indent
    */
    private void postOrderTraverseTree(Node<T> node) {
        String indent="";
        if(node==this.root){indent="";}else{indent=" ";}
        if (node != null) {
            postOrderTraverseTree(node.leftchild);
            postOrderTraverseTree(node.rightchild);
            System.out.println(indent+node);

        }
    }
 }
