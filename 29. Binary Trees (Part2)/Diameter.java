import java.util.*;


public class Diameter {
    static class BinaryTree {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        Node root;

        BinaryTree(int arr[]) {
            root = buildTree(arr, 0);
        }

        public Node buildTree(int arr[], int idx) {
            if (idx >= arr.length || arr[idx] == 0)
                return null;

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr, idx * 2 + 1);
            newNode.right = buildTree(arr, (idx + 1) * 2);

            return newNode;
        }

        public int getMaxDepth(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDepth = getMaxDepth(root.left);
            int rightDepth = getMaxDepth(root.right);

            return Math.max(leftDepth, rightDepth) + 1;
        }

        public int getDiameter(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = getDiameter(root.left);
            int rightDiameter = getDiameter(root.right);
            int leftHeight = getMaxDepth(root.left);
            int rightHeight = getMaxDepth(root.right);
            int fullDiameter = leftHeight + rightHeight + 1;

            return Math.max(fullDiameter, Math.max(leftDiameter, rightDiameter));
        }

        public int getDiameter() {
            return getDiameter(root);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0, 0, 9, 0, 0, 6, 10, 0, 0, 7 };

        BinaryTree bt = new BinaryTree(arr);

        int diameter = bt.getDiameter();

        System.out.println(diameter);
    }
}
