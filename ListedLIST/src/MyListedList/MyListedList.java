package MyListedList;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-09-03
 * Time: 10:36
 */
public class MyListedList {
    static class ListNode{
        public int val;
        public ListNode prev;
        public ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode  head;
    public ListNode last;//表示当前位置链表的尾节点
    public void display(){
        ListNode cur=head;
        while(cur!=null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if (head==null){
            head=node;
            last=node;
        }else {
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if (head==null){
            head=node;
            last=node;
        }else {
            last.next=node;
            node.prev=last;
            last=last.next;
        }
    }
    //任意节点插入
    public void addIndex(int index,int data){
        //1、检查index合法性
        if (index<0||index>size()){
            throw new IndexNotLegalException("双向链表index不合法");
        }
        if (index==0){
            addFirst(data);
            return;
        }
        if (index==size()){
            addLast(data);
            return;
        }
        ListNode node=new ListNode(data);
        //2、获取当前的index位置的节点的地址
        ListNode cur=findIndex(index);
        node.next=cur;
        cur.prev.next=node;
        node.prev=cur.prev;
        cur.prev=node;
    }
    private ListNode findIndex(int index){
        ListNode cur=head;
        while (index!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur=head;
        while (cur!=null){
            //找到了，开始删除
            if (cur.val==key){
                //处理头部问题
               if (cur==head){
                   head=head.next;
                   if (head!=null){
                       //防止只有一个节点
                       head.prev=null;
                   }
               }else {
                   cur.prev.next=cur.next;
                   if (cur.next!=null) {
                       //删除的不是尾节点
                       cur.next.prev = cur.prev;
                   }else {
                       //删除的是尾节点
                       last=cur.prev;
                   }
               }
               return;//这行注释掉就是删除所有key
            }
            cur=cur.next;
        }
    }
    public boolean contains(int key){
        ListNode cur=head;
        while(cur!=null) {
            if(cur.val==key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public int size(){
        int count=0;
        ListNode cur=head;
        while(cur!=null) {
           count++;
            cur = cur.next;
        }
        return count;
    }
    public void clear(){
        ListNode cur=head;
        while (cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur.prev=null;
            cur=curNext;
        }
        head=null;
        last=null;
    }

}
