package MyListedList;

import java.util.Stack;

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
    //*****链表分割、
    public ListNode partition(int x){
        ListNode bs=null;
        ListNode be=null;
        ListNode as=null;
        ListNode ae=null;
        ListNode cur=head;
        while (cur != null) {
            if (cur.val<x){
                //插入到第一个段，一定用尾插，题目要求顺序不变
                if (bs==null){//第一次插入元素，之前链表为空
                    bs=cur;
                    be=cur;
                }else {
                    be.next=cur;
                    be=be.next;
                }
            }else {
                //插入到第二个段中，一定用尾插
                if (as==null){//第一次插入元素，之前链表为空
                    as=cur;
                    ae=cur;
                }else {
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            cur=cur.next;
        }
        be.next=as;
        if (as!=null){
            ae.next=null;
        }
        return bs;
    }
    //****给一个链表，判断是不是回文,要求空间复杂度o（1）；
    //如何能让指针从后往前走呢？1.找中间2.翻转3.往回走4.偶数个节点处理
    public boolean chkPalindrome(){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //开始翻转
        ListNode cur=slow.next;
        while (cur!=null){
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //开始判断回文
        while (head!=slow){
            if (head.val!=slow.val){
                return false;
            }
            if (head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
//****两链表相交，是Y型不是X型
    //解题思路：1.求两个链表的长度2.计算两个链表长度的差值3.让最长的链表走差值步4.两个链表一起走，相遇点就是相交的节点
//判断链表是否有环
    public boolean hasCycle(){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        if (fast==null||fast.next==null){
            return false;
        }
        return true;
    }
    //求环形链表的入口点
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        if (fast==null||fast.next==null){
            return null;
        }
        slow=head;//原理是头节点到入口点的距离和相遇点到入口点的距离相等
        while (slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
//递归实现，单链表的逆序打印
    public void printList(ListNode head){
        if (head==null){
            return;
        }
        if (head.next==null){
            System.out.println(head.val+" ");
            return;
        }
        printList(head.next);
        System.out.println(head.val+" ");
    }
    //非递归实现
    public void printList2(){
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=head;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while (!stack.empty()){
            ListNode top=stack.pop();
            System.out.println(top.val+" ");
        }
    }
}
