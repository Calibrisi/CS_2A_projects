/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jtmel
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree("CAT");
        tree.insert("DOG");
        tree.insert("HOUSE");
        tree.insert("ABA");
        tree.insert("ZOO");
        tree.insert("LITTER");
        tree.insert("CANON");
        tree.insert("ZZZZZ");
        
        System.out.println("Inorder ");
        tree.inorder();
        System.out.println("Pre Order");
        tree.PreOrder();
        System.out.println("Post Order");
        tree.PosOrder();
        System.out.println("Reverse Order");
        tree.reverseorder();
    }
    
}


/*
Node class from the video
*/
class Node {
    String info;
    Node left;
    Node right;
    public Node()
    {
        
    }
    public Node(String data)
    {
        info = data;
    }
}

/*
Binary Tree class from Video -- this is the program you finish
*/
class BinaryTree {
    Node root;
    public BinaryTree(String info)
    {
        root = new Node();
        root.info = info;
        root.left = null;
        root.right = null;
    }
    
    public void Add(String info)
    {
        Node currentnode = root;
        
        while(true)
        {
            if(currentnode.info.compareTo(info) > 0) // go left
            {
                if(currentnode.left != null)
                {
                    currentnode = currentnode.left;
                    continue;
                }
                else
                {
                    currentnode.left = new Node();
                    currentnode = currentnode.left;
                    currentnode.info = info;
                    break;
                }
                
            }
            else
            {
                if(currentnode.right != null)
                {
                    currentnode = currentnode.right;
                    continue;
                }
                else
                {
                    currentnode.right = new Node();
                    currentnode = currentnode.right;
                    currentnode.info = info;
                    break;
                }
            }
        }
    }
     public void insert(String data)
     {
         root = insert(root, data);
     }
     /* Function to insert data recursively */
     private Node insert(Node node, String data)
     {
         if (node == null)
             node = new Node(data);
         else
         {
             if(node.info.compareTo(data)>0)
                 node.left = insert(node.left,data);
             else
                 node.right = insert(node.right, data);
                          
         }
         return node;
     } 
    
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(Node r)
     {
         if (r != null)
         {
             inorder(r.left);
             System.out.print(r.info +" ");
             inorder(r.right);
         }
     }

     public void reverseorder()
     {
         // finish this method you will have to add 1 more method to get it to work
         reverseOrderHelper(root);
         
     }
     
     private void reverseOrderHelper(Node r)
     {
         if (r != null)
         {
             reverseOrderHelper(r.right);
             System.out.print(r.info +" ");
             reverseOrderHelper(r.left);
         }
     }
     
     public void PreOrder()
     {
         // finish this method you will have to add 1 more method to get it to work
         preOrderHelper(root);
     }
     
     private void preOrderHelper(Node r)
     {
         if (r != null)
         {
             System.out.print(r.info +" ");
             preOrderHelper(r.left);
             preOrderHelper(r.right);
         }
     }
     
     public void PosOrder()
     {
         // finish this method you will have to add 1 more method to get it to work
         posOrderHelper(root);
     }
     
     private void posOrderHelper(Node r)
     {
         if (r != null)
         {
             posOrderHelper(r.left);
             posOrderHelper(r.right);
             System.out.print(r.info +" ");
         }
     }
}
