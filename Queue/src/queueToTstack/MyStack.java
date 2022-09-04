package queueToTstack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description://队列实现栈:入栈：入到不为空的队列；出栈：出不为空的队列，size-1个
 * User: xinyu
 * Date: 2022-09-04
 * Time: 14:26
 */
public class MyStack {
    Queue<Integer> qu1;
    Queue<Integer> qu2;
    public int usedSize;
    public MyStack(){
        qu1=new LinkedList<>();
        qu2=new LinkedList<>();
    }
    //入栈
    public void push(int x){
        if (!qu1.isEmpty()){
            qu1.offer(x);
        } else if (!qu2.isEmpty()) {
            qu2.offer(x);
        }else {
            qu1.offer(x);
        }
        usedSize++;
    }
    //出栈
    public int pop(){
        if (empty()){
            return -1;
        }
        //size会变化
        if (!qu1.isEmpty()){
            int curSize=qu1.size();
            for (int i = 0; i < curSize-1; i++) {
                qu2.offer(qu1.poll());
            }
            usedSize--;
            return qu1.poll();
        }else {
            int curSize=qu2.size();
            for (int i = 0; i <curSize-1; i++) {
                qu1.offer(qu2.poll());
            }
            usedSize--;
            return qu2.poll();
        }
    }
    //peek
    public int top(){
        if (empty()){
            return -1;
        }
        //size会变化
        if (!qu1.isEmpty()){
            int curSize=qu1.size();
            int ret=-1;
            for (int i = 0; i < curSize-1; i++) {
                ret=qu1.poll();
                qu2.offer(ret);
            }
            return qu1.poll();
        }else {
            int curSize=qu2.size();
            int ret=-1;
            for (int i = 0; i <curSize-1; i++) {
                ret=qu2.poll();
                qu1.offer(ret);
            }
            return qu2.poll();
        }
    }
    //空
    public boolean empty(){
        return usedSize==0;
    }
    public boolean empty2(){
        return qu1.isEmpty()&&qu2.isEmpty();
    }


}
