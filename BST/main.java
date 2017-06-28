/**
*Main class which will call all binarySearchTree methods
*@author:(Adam Egan)(115359356)
*/
public class main{
          public static void main(String[] args){
             final binarySearchTree<Integer> theTree=new binarySearchTree<Integer>();
             theTree.insert(1);
             theTree.insert(2);
             theTree.insert(0);
             System.out.println("Pre Order:");
             theTree.showpreOrder();
             System.out.println("InOrder:");
             theTree.showinOrder();
             System.out.println("Post Order:");
             theTree.showpostOrder();
           
         }

}
