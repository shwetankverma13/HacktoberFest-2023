class Solution {
    
    /*PriorityQueue<Integer>pq=new PriorityQueue<>();
    int c=0;
    public int goodNodes(TreeNode root) {
        inorder(root);
        return c;
    }
    void inorder(TreeNode root)
    {
        if(pq.isEmpty() || -root.val<=pq.peek())
            c++;
        pq.add(-root.val);
        //System.out.println(pq);
        if(root.left!=null)
        {inorder(root.left);
        pq.remove(new Integer(-root.left.val));}
        if(root.right!=null)
        {inorder(root.right);
        pq.remove(new Integer(-root.right.val));}
    }*/
    
    int c=1;
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        inorder(root,Integer.MIN_VALUE);
        return c;
    }
    void inorder(TreeNode root,int max)
    {
        if(root==null)
            return;
         max=Math.max(max,root.val);
        if(root.left!=null && root.left.val>=max)
            c++;
        if(root.right!=null && root.right.val>=max)
            c++;
        inorder(root.left,max);
        inorder(root.right,max);
    }
}
