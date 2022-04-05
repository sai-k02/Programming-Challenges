public class Sandbox {
    public static void main(String[] args){
        // DEFINE BST
        BinaryTree bst = new BinaryTree();

        bst.add(1);
        bst.add(2);
        bst.add(3);
        bst.add(7);
        bst.add(5);
        bst.add(4);
        bst.add(10);
        
        Node eh = null;

        int closest = findClosestValRec(eh, 20, 100000);

        System.out.println(closest);
    }

    public static boolean isSameTree(Node p, Node q) {
        // return false when one of them is null and while the other isnt 
        if(p == null && q != null){
            return false;
        }
        // return false when one of them is null and while the other isnt 
        if(p != null && q == null){
            return false;
        }
        if(p == null && q == null){
            return true;
        }
        if(p.value == q.value){
            // recursively check the left tree and right tree
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }else{
            return false;
        }
        
        
    }

    // recursive approach to finding the closest value
    public static int findClosest(Node tree,int target,int closest) {
        if (tree == null) {
          return closest;
        } 
        else {
          if (Math.abs(tree.value - target) < Math.abs(closest - target)) {
            closest = tree.value;
          }
          if (target < tree.value) {
            return findClosestVal(tree.left, target, closest);
          } else {
            return findClosestVal(tree.right, target, closest);
        }
      }
    }
    
}
