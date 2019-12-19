/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
/**
 *
 * @author Sidney Seay
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    
      
    public static void main(String[] args) {
        // TODO code application logic here
        
        class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;
    int item;

    public TreeNode (TreeNode left, TreeNode right, TreeNode parent, int item) {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
     // constructor
  //public LinkedList(String word, LinkedList next) {
  //  this.word = word;
  //  this.next = next;
//  }
    
    
}


      
    }
    
}
