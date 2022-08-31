package MyListedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-30
 * Time: 22:13
 */
public class Test {
    public static void main(String[] args) {
        TestSingleList test=new TestSingleList();
        test.addFirst(1);
        test.addLast(3);
        test.addIndex(1,2);
        //test.display();
        test.remove(4 );
        //test.display();
        test.addLast(2);
        test.display();
        System.out.println("————————————————————");
        test.removeAllKey(1);
        test.display();

    }
}
