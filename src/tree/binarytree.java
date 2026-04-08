package tree;

import java.util.Queue;

import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}
public class BinaryTree {
    static Node createNode(int val) {
        return new Node(val);
    }
    static void DFS(Node root){
        if(root==null){
            return;
        }

        DFS(root.left);
        DFS(root.right);
        System.out.print(root.data+" "); // modifiy it upper and lower for in, pre, post dfs
    }
    static void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root=createNode(1);
        root.left = createNode(2);
        root.right = createNode(3);
        root.left.left=createNode(4);
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        root.left.right.left=createNode(8);
        root.right.left.left=createNode(15);
        root.right.left.right=createNode(9);
        System.out.println("DFS traversal:");
        DFS(root);
        System.out.println("BFS TRaversal: ");
        BFS(root);
    }
}