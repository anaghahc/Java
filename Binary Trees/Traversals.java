import java.util.*;

public class Traversals {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    public static void printPreorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void printPostorder(Node root) {
        if (root == null) {
            return;
        }

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void printLevelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current == null) {
                System.out.println();
                if (queue.isEmpty())
                    break;
                else
                    queue.add(null);
            } else {
                System.out.print(current.data + " ");
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        printPreorder(root);
        System.out.println();
        printInorder(root);
        System.out.println();
        printPostorder(root);
        System.out.println();
        printLevelorder(root);
    }
}