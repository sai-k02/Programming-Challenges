public class BinaryTree {
    // DEFINE ROOT
    private Node root;

    // ADD
    public void add(int value) {
        root = addRecursive(root, value);
    }

    // ADD RECURSIVELY
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
    
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }

    // CHECK IF
    public Node getRoot(){
        return root;
    }
}