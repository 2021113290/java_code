import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-09-05
 * Time: 20:35
 */
public class BinaryTree {
    static class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(char val){
            this.val=val;
        }
    }
    public TreeNode root;//二叉树的根节点
    public void createTree(){
        TreeNode A=new TreeNode('A');
        TreeNode B=new TreeNode('B');
        TreeNode C=new TreeNode('C');
        TreeNode D=new TreeNode('D');
        TreeNode E=new TreeNode('E');
        TreeNode F=new TreeNode('F');
        TreeNode G=new TreeNode('G');
        TreeNode H=new TreeNode('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;
        this.root=A;
    }
    //前序遍历
    public void preOrder(TreeNode root){
        if (root==null)return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    public void inOrder(TreeNode root){
        if (root==null)return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    //后序遍历
    public void postOrder(TreeNode root){
        if (root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    //给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
    //子问题思路
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret=new ArrayList<>();
        if (root==null)return ret;
        ret.add((int) root.val);
        List<Integer> LeftTree=preorderTraversal(root.left);
        ret.addAll(LeftTree);
        List<Integer> RightTree=preorderTraversal(root.right);
        ret.addAll(RightTree);
        return ret;
}
//遍历思路
List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root==null)return list;
        list.add((int) root.val);
        preorderTraversal2(root.left);
        preorderTraversal2(root.right);
        return list;
}//中序遍历和后序遍历就是添加根在代码的位置不同
    //获取树中节点的个数
//子问题思路 获取树中节点的个数
    int size(TreeNode root){
        if (root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
    //遍历思路：只要遍历到了节点 就nodeSize++
    public static int nodeSize;
    void size2(TreeNode root){
        if (root==null){
            return ;
        }
        nodeSize++;
        size2(root.left);
        size2(root.right);
    }
    //求叶子节点个数
    //子问题：左树的叶子+右树的叶子
    int getLeafNodeCount(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount(root.left)+getLeafNodeCount(root.right);
    }
    //遍历问题：遍历到叶子就++
    public static int LeafSize;
    void getLeafNodeCount2(TreeNode root){
        if (root==null){
            return;
        }
        if (root.left==null&&root.right==null){
            LeafSize++;
        }
        getLeafNodeCount2(root.left);
        getLeafNodeCount2(root.right);
    }
    //子问题思路
    //获取第k层节点的个数
    int getKLevelNodeCount(TreeNode root,int k){
        if (root==null){
            return 0;
        }
        if (k==1){
            return 1;
        }
        return getKLevelNodeCount(root.right,k-1)+getKLevelNodeCount(root.left,k-1);
    }
    //获取二叉树的高度：左树高度和右树高度的最大值+1
    int getHeight(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    //检测值为value的元素是否存在
    TreeNode find(TreeNode root,int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }
        TreeNode ret1 = find(root.left, val);
        if (ret1 != null) {
            return ret1;
        }
        TreeNode ret2 = find(root.right, val);
        if (ret2 != null) {
            return ret2;
        }
        return null;
    }
    //100.相同的树
    // 时间复杂度O(MIN(N,M))
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q!=null||p!=null&&q==null){
            return false;
        }
        if (p==null&&q==null){
            return true;
        }
        if (p.val!=q.val){
            return false;
        }
        //p!=null&&q!=null&&p.val=q.val
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //572.判断是不是子树,时间复杂度O（m*n）,tree节点n个，subtree节点m个，每一次大树上的点都要和子树进行匹配
    //1.两个树是否相同？2.子树是不是和另一个树相同
    public boolean isSubtree(TreeNode root,TreeNode subRoot){
        if(root==null||subRoot==null)return false;
        if (isSameTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    //判断一棵树是不是平衡二叉树
    //这个时间复杂度是O（n^2）
    public boolean isBalanced(TreeNode root){
        if (root==null)return true;
        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1&&isBalanced(root.right)&&isBalanced(root.left);
    }
    //解决方案：减少时间复杂度，从下往上
    public int maxDepth(TreeNode root){
        if (root==null)return 0;
        int leftTree=maxDepth(root.left);
        int rightTree=maxDepth(root.right);
        if (leftTree>=0&&rightTree>=0&&Math.abs(leftTree-rightTree)<=1){
            return Math.max(leftTree,rightTree)+1;
        }else {
            return -1;
        }
    }
    public boolean isBalanced2(TreeNode root){
        if (root==null)return true;
        return maxDepth(root)>=0;
    }
    //对称二叉树，判断root左树和右树是否对称，左树的左和右树的右，左树的右和右树的左
    public boolean isSymmetric(TreeNode root){
        if (root==null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree){
        if (leftTree==null&&rightTree!=null||leftTree!=null&&rightTree==null){
            return false;
        }
        if (leftTree==null&&rightTree==null){
            return true;
        }
        if (leftTree.val!=rightTree.val){
            return false;
        }
        return isSymmetricChild(leftTree.left,rightTree.right)&&isSymmetricChild(leftTree.right,rightTree.left);
    }
    //层序遍历
    void levelOrder(TreeNode root){
        if (root==null)return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur=queue.poll();
            System.out.print(cur.val+" ");
            if (cur.left!=null){
                queue.offer(cur.left);
            }
            if (cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
    //1688求一棵树的左视图
}



