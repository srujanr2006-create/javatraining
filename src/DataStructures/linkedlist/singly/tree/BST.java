package DataStructures.linkedlist.singly.tree;

import java.util.LinkedList;
import java.util.Queue;

class node{
    int key;
    node left;
    node right;

    node (int key){
        this.key= key;
        this.left = left;
        this.right = right;
    }
}

public class BST {
   node root;
   BST(){
       root = null;
   }
   private node insertRec(node root, int key){
       if (root==null){
           return new node(key);
       }
       if (key<root.key){
           root.left = insertRec(root.left,key);
       }else if (key>root.key){
           root.right=insertRec(root.right,key);
       }
       return root;
   }
   public void insert(int key){
       root = insertRec(root,key);

   }
   private boolean searchRec(node root,int key) {
       if (root == null) {
           return false;
       }
       if (key == root.key) {
           return true;
       }
       if (key < root.key) {
           return searchRec(root.left, key);
       } else {
           return searchRec(root.right, key);
       }
   }
   public boolean search(int key) {
       return searchRec(root, key);
   }

   void DFS(node root) {
       if (root == null){
           return;
   }
       DFS(root.left);
       System.out.print(root.key + " ");
       DFS(root.right);
       }
   void BFS(){
       Queue<node> q = new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
           node temp = q.poll();
           System.out.println(temp.key + " ");
           if (temp.left!=null){
               q.offer(temp.left);
}
if (temp.right!=null){
    q.offer(temp.right);
}
       }
    }
}

class driver4{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(180);
        bst.insert(30);
        bst.insert(80);
        bst.insert(150);
        bst.insert(200);
        bst.insert(60);
        bst.insert(120);
        bst.insert(170);

        System.out.println("BSF traversal: ");
        bst.BFS();
        System.out.println();
        System.out.println("DFS inorder traversal: ");
        bst.DFS(bst.root);

        int key = 1;
        System.out.println(bst.search(key));

    }
}