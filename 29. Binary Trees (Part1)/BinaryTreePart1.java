import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePart1 {
    static class BinaryTree {
        int idx;
        Node root;

        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        BinaryTree(int arr[]) {
            idx = -1;
            root = buildTree(arr);
        }

        public Node buildTree(int arr[]) {
            idx++;
            if (idx >= arr.length || arr[idx] == -1)
                return null;

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }

        public void recursivelyGeneratePreorder(Node parentNode, Queue<Integer> queue) {
            if (parentNode != null) {
                queue.add(parentNode.data);
                recursivelyGeneratePreorder(parentNode.left, queue);
                recursivelyGeneratePreorder(parentNode.right, queue);
            }
        }

        public int[] getPreorder() {
            Queue<Integer> queue = new LinkedList<>();
            recursivelyGeneratePreorder(root, queue);

            int arr[] = new int[queue.size()];
            int i = 0;
            while (!queue.isEmpty()) {
                arr[i++] = queue.remove();
            }

            return arr;
        }

        public void recursivelyGenerateInorder(Node parentNode, Queue<Integer> queue) {
            if (parentNode != null) {
                recursivelyGenerateInorder(parentNode.left, queue);
                queue.add(parentNode.data);
                recursivelyGenerateInorder(parentNode.right, queue);
            }
        }

        public int[] getInorder() {
            Queue<Integer> queue = new LinkedList<>();
            recursivelyGenerateInorder(root, queue);

            int arr[] = new int[queue.size()];
            int i = 0;
            while (!queue.isEmpty()) {
                arr[i++] = queue.remove();
            }

            return arr;
        }

        public void recursivelyGeneratePostOrder(Node parentNode, Queue<Integer> queue) {
            if (parentNode != null) {
                recursivelyGeneratePostOrder(parentNode.left, queue);
                recursivelyGeneratePostOrder(parentNode.right, queue);
                queue.add(parentNode.data);
            }
        }

        public int[] getPostOrder() {
            Queue<Integer> queue = new LinkedList<>();
            recursivelyGeneratePostOrder(root, queue);

            int arr[] = new int[queue.size()];
            int i = 0;
            while (!queue.isEmpty()) {
                arr[i++] = queue.remove();
            }

            return arr;
        }

        public void recursivelyGenerateLevelOrder(Node parentNode, Queue<Queue<Integer>> queue) {
            if (parentNode != null) {

            }
        }

        public int[][] getLevelOrder() {
            List<Queue<Integer>> list = new LinkedList<>();
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            Queue<Integer> temp = new LinkedList<>();
            while (!q.isEmpty()) {
                Node curr = q.remove();

                if (curr == null) {
                    list.add(temp);
                    temp = new LinkedList<>();
                    if (q.size() > 0)
                        q.add(null);
                    continue;
                }

                temp.add(curr.data);

                Node leftNode = curr.left;
                Node rightNode = curr.right;

                if (leftNode != null) {
                    q.add(leftNode);
                }

                if (rightNode != null) {
                    q.add(rightNode);
                }
            }

            int size = list.get(list.size() - 1).size();
            int arr[][] = new int[size][size];

            for (int i = 0; i < size; i++) {
                Queue<Integer> innerQueue = list.get(i);
                int j = 0;
                while (!innerQueue.isEmpty()) {
                    arr[i][j++] = innerQueue.remove();
                }
            }

            return arr;
        }

        public int recursivelyCalculateHeight(Node parentNode) {
            if (parentNode == null)
                return 0;

            return Math.max(recursivelyCalculateHeight(parentNode.left),
                    recursivelyCalculateHeight(parentNode.right)) + 1;
        }

        public int getHeight() {
            return recursivelyCalculateHeight(root);
        }

        public int recursivelyCalculateCount(Node parentNode) {
            if (parentNode == null)
                return 0;

            return recursivelyCalculateCount(parentNode.left) + recursivelyCalculateCount(parentNode.right) + 1;
        }

        public int getCount() {
            return recursivelyCalculateCount(root);
        }

        public int recursivelyCalculateSum(Node parentNode) {
            if (parentNode == null)
                return 0;

            return recursivelyCalculateSum(parentNode.left) + recursivelyCalculateSum(parentNode.right)
                    + parentNode.data;
        }

        public int getSum() {
            return recursivelyCalculateSum(root);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree(arr);

        int[] preOrder = bt.getPreorder();
        int[] inOrder = bt.getInorder();
        int[] postOrder = bt.getPostOrder();
        int[][] levelOrder = bt.getLevelOrder();

        System.out.println(Arrays.toString(preOrder));
        System.out.println(Arrays.toString(inOrder));
        System.out.println(Arrays.toString(postOrder));

        for (int[] level : levelOrder) {
            System.out.println(Arrays.toString(level));
        }

        int height = bt.getHeight();
        System.out.println(height);

        int count = bt.getCount();
        System.out.println(count);

        int sum = bt.getSum();
        System.out.println(sum);
    }
}