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
List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root==null)return list;
        list.add((int) root.val);
        preOrder(root.left);
        preOrder(root.right);
        return list;
}}



