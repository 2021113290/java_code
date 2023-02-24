import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
 * 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
 * User: xinyu
 * Date: 2022-09-11
 * Time: 15:38
 */
public class Main {
    class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(char val){
            this.val=val;
        }
    }
    public int i=0;
    public TreeNode creatTree(String s){
        TreeNode root=null;
        if (s.charAt(i)!='#'){
            root=new TreeNode(s.charAt(i));
            i++;
            root.left=creatTree(s);
            root.right=creatTree(s);
        }else {
            i++;
        }
        return root;
    }
    public void inorder(TreeNode root){
        if (root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (scan.hasNextLine()){
            String s=scan.nextLine();
            Main m=new Main();
            TreeNode root= m.creatTree(s);
            m.inorder(root);
        }
    }
}
