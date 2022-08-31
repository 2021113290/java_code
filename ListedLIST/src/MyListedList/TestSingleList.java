package MyListedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-30
 * Time: 21:41
 */
public class TestSingleList {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode head;//表示存储当前链表的头节点的引用
    //打印顺序表
    public void display(){
        ListNode cur=this.head;
        while (cur!=null){
            System.out.println(cur.val+" ");
            cur=cur.next;
        }
    }
    //查找表里是否含有key元素
    public boolean contains(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //得到单链表长度
    public int size(){
        ListNode cur=head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        node.next=head;
        head=node;
    }
    //尾插法o(n)
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if (head==null){
            head=node;
        }else{
            ListNode cur=head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    private void checkIndex(int index){
        if (index<0||index>size()){
            throw new IndexNotLegalException("index位置不合法");
        }
    }
    public void addIndex(int index,int data){
        checkIndex(index);
        if (index==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        //说明，不是头插尾插且index合法
        ListNode node=new ListNode(data);
        ListNode cur=findIndexSubOfOne(index);
        node.next=cur.next;
        cur.next=node;
    }
    private ListNode findIndexSubOfOne(int index){
        ListNode cur=head;
        while (index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (head.val==key){
            head=head.next;
            return;
        }
        ListNode cur=searchPreOfKey(key);
        if (cur==null)return;
        cur.next=cur.next.next;
    }
    //找到关键字为key的前驱
    private ListNode searchPreOfKey(int key){
        ListNode cur=head;
        while(cur.next!=null){
            if (cur.next.val==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    //删除所有值为key的节点,******面试题*******
    public void removeAllKey(int key){
        if (head==null)return;
        ListNode prev=head;
        ListNode cur=head.next;
        while (cur!=null){
            if (cur.val==key) {
                prev.next = cur.next;
            }
            else {
                prev=cur;
            }
            cur = cur.next;
        }
        //头节点注意
        if (head.val==key){
            head=head.next;
        }
    }
    //清空链表
    public void clear(){
        ListNode cur=head;
        while (cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur=curNext;
        }
        head=null;
        //或者直接this.head=null;
    }
    //面试题，***反转链表***
    public ListNode reverseList(){
        if(head==null)return null;//说明链表是空的
        if (head.next==null)return head;//说明只有一个节点
        ListNode cur=head.next;//当前需要翻转的节点
        head.next=null;//head其实就是当前需要翻转的节点的前驱
        while (cur!=null){
            ListNode curNext=cur.next;
            cur.next=head;
            head=cur;
            cur=curNext;
        }
        return head;
        //这个做法的思想就是，先把头节点的指针域置为空就没有链接了，然后把cur头插
        //leetcode上有另外一种解法，就是再设置一个前置节点dummy
    }
    //**面试题**：给定一个带有头节点head的非空单链表，返回链表的中间节点。如果有两个中间节点，则返回第二个中间节点
    //思路：遍历一次，更高效。快慢指针，路程一样，一个走一步，一个走两步。fast走到末尾，slow走到中间
    public ListNode middleNode(ListNode head){
        if (head==null)return null;//注意空链表
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next==null){//先后顺序判断不能颠倒且一定用&&
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //面试题****输出倒数第k个节点******、
    //面试要求：k合法的情况下，遍历一次，快指针先走k-1步，然后一起走，当fast.next==null时，slow就是倒数第k个
    public ListNode FindKthToTail(int k){
        if (k<=0||k>size()){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (k-1!=0){
            fast=fast.next;
            k--;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
