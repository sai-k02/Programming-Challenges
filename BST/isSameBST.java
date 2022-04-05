public class isSameBST {

	public static boolean isSameTree(TreeNode p, TreeNode q) {
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
        if(p.val == q.val){
            // recursively check the left tree and right tree
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }else{
            return false;
        }
        
        
    }

}
