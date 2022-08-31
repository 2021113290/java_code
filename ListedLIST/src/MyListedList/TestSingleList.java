package MyListedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-30
 * Time: 21:41
 */
public class TestSingleList {
    static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public Node head;//表示存储当前链表的头节点的引用
    //打印顺序表
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.println(cur.val+" ");
            cur=cur.next;
        }
    }
    //查找表里是否含有key元素
    public boolean contains(int key) {
        Node cur = head;
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
        Node cur=head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    //尾插法o(n)
    public void addLast(int data){
        Node node=new Node(data);
        if (head==null){
            head=node;
        }else{
            Node cur=head;
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
        Node node=new Node(data);
        Node cur=findIndexSubOfOne(index);
        node.next=cur.next;
        cur.next=node;
    }
    private  Node findIndexSubOfOne(int index){
        Node cur=head;
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
        Node cur=searchPreOfKey(key);
        if (cur==null)return;
        cur.next=cur.next.next;
    }
    //找到关键字为key的前驱
    private Node searchPreOfKey(int key){
        Node cur=head;
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
        Node prev=head;
        Node cur=head.next;
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
        Node cur=head;
        while (cur!=null){
            Node curNext=cur.next;
            cur.next=null;
            cur=curNext;
        }
        head=null;
        //或者直接this.head=null;
    }
}
