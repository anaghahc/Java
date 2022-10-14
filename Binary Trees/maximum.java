public class maximum {
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

        static Node buildTree(int[] nodes) {
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

    static int getMax(Node root) {
        if (root == null) {
            return -1;
        }
        int ans = root.data;
        int left = getMax(root.left);
        int right = getMax(root.right);

        if (left > ans)
            ans = left;
        if (right > ans)
            ans = right;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);
        System.out.println(getMax(root));
    }
}
