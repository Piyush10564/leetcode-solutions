class Solution {
    public boolean isBalanced(TreeNode root) {
     if(root==null) return true;

     int left2 = findheight(root.left);
     int right2 = findheight(root.right);

     if(Math.abs(left2-right2)>1) return false;
     return isBalanced(root.left) && isBalanced(root.right);
    }

    static public int findheight(TreeNode root){
        if(root==null) return 0;
        int left1 = findheight(root.left);
        int right1 = findheight(root.right);

        return Math.max(left1,right1) + 1;
    }
}