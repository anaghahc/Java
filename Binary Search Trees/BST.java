import java.util.ArrayList;

import javax.lang.model.element.Element;

public class BST {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node insert (Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val<root.data){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key<root.data){
            return search(root.left, key);
        }
        else
            return search(root.right, key);
        
    }

    static Node delete(Node root , int key){
        if(key<root.data){
            root.left = delete(root.left, key);
        }
        else if(key>root.data){
            root.right = delete(root.right, key);
        }
        else{
            if (root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else{
                Node inorder = inorderSuccessor(root.right);
                root.data = inorder.data;
                root.right = delete(root.right, inorder.data);
                
            }            
        }
        return root;
    }

    static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    static void inRange(Node root , int X , int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            inRange(root.left, X, Y);
            System.out.print(root.data+" ");
            inRange(root.right, X, Y);
        }
        else if (root.data<=X){
            inRange(root.right, X, Y);
        }
        else{
            inRange(root.left, X, Y);
        }
        
    }
    static void printPath(ArrayList<Integer> path){
        for(int i =0 ; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    static void printRoot2Leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        
        path.remove(path.size()-1);
    }

    static void printInorder(Node root){
        if(root == null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);

    }

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i =0; i<arr.length;i++){
            root = insert(root, arr[i]);
        }      
        printInorder(root); 
        System.out.println();
        System.out.println(search(root, 8)); 
        delete(root, 3);
        printInorder(root);
        inRange(root, 3, 5);
        printRoot2Leaf(root, new ArrayList<>());
    }
    
}