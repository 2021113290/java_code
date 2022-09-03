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
    //****相交链表,返回的是相交的节点/两链表相交，是Y型不是X型
    //    //解题思路：1.求两个链表的长度2.计算两个链表长度的差值3.让最长的链表走差值步4.两个链表一起走，相遇点就是相交的节点
    public static TestSingleList.ListNode getIntersectionNode(TestSingleList.ListNode headA,TestSingleList.ListNode headB){
        //1.分别求两个链表的长度
        int lenA=0;
        int lenB=0;
        TestSingleList.ListNode pl=headA;//pl代表永远指向长的链表
        TestSingleList.ListNode ps=headB;//ps代表永远指向短的链表
        while (pl!=null){
            lenA++;
            pl=pl.next;
        }
        while (ps!=null){
            lenB++;
            ps=ps.next;
        }
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if (len<0){
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        //len一定是一个正数，是两个链表长度的差值
        while (len!=0){
            pl=pl.next;
            len--;
        }
        while (pl!=ps){
            pl=pl.next;
            ps=ps.next;
        }
        return pl;
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
        test.partition(3);
        test.display();
    }
}
