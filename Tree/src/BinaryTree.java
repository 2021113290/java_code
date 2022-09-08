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
        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }
    //后序遍历
    public void postOrder(TreeNode root){
        if (root==null)return;
        preOrder(root.left);
        preOrder(root.right);
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
}



