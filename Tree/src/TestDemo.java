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
        binaryTree.preOrder(binaryTree.root);
    }
}
