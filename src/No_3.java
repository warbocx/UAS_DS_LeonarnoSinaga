public class No_3 {
    private Node root;
    private int size;

    public No_3() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
        size++;
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node current) {
        if (current != null) {
            inOrderTraversalRecursive(current.left);
            System.out.print(current.value + " ");
            inOrderTraversalRecursive(current.right);
        }
    }

    public int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node current) {
        if (current.left == null) {
            return current.value;
        }
        return findMinRecursive(current.left);
    }

    public int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node current) {
        if (current.right == null) {
            return current.value;
        }
        return findMaxRecursive(current.right);
    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        No_3 bt = new No_3();
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);

        System.out.print("In-order traversal: ");
        bt.inOrderTraversal();
        System.out.println();
        System.out.println("Minimum value: " + bt.findMin());
        System.out.println("Maximum value: " + bt.findMax());
        System.out.println("Size: " + bt.getSize());
    }
}
