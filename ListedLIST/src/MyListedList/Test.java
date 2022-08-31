package MyListedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-30
 * Time: 22:13
 */
public class Test {
    //合并两个链表，使其为升序
    public TestSingleList.ListNode mergeTwoLists(TestSingleList.ListNode head1,TestSingleList.ListNode head2){
        TestSingleList.ListNode newHead=new TestSingleList.ListNode(-1);//傀儡节点，虚拟节点，其实就是dummy
        TestSingleList.ListNode tmp=newHead;
        while (head1!=null&&head2!=null){
            if (head1.val<head2.val){
                tmp.next=head1;
                head1=head1.next;
                tmp=tmp.next;
            }else {
                tmp.next=head2;
                head2=head2.next;
                tmp=tmp.next;
            }
        }
        //跳出循环，说明有两种情况：1.head2==null   2.head1==null
        if (head1!=null){
            tmp.next=head1;
        }
        if (head2!=null){
            tmp.next=head2;
        }
        return newHead.next;
    }

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
