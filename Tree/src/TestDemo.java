/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-09-05
 * Time: 20:49
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createTree();
        System.out.println("前序遍历");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("节点的个数1："+binaryTree.size(binaryTree.root));
        binaryTree.size2(binaryTree.root);
        System.out.println("节点的个数2："+BinaryTree.nodeSize);
        System.out.println("叶点的个数1："+binaryTree.getLeafNodeCount(binaryTree.root));
        binaryTree.getLeafNodeCount2(binaryTree.root);
        System.out.println("叶点的个数2："+BinaryTree.LeafSize);
    }
}
