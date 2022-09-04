package queueToTstack;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-09-04
 * Time: 15:03
 */
public class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void push(int x){
        s1.push(x);
    }
    public int pop(){
        if(empty()){
            return -1;
        }
        if (s2.empty()){
            //需要将s1当中的元素全部倒过来
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        //此时s2当中一定有元素
        return s2.pop();
    }
    public int peek(){
        if(empty()){
            return -1;
        }
        if (s2.empty()){
            //需要将s1当中的元素全部倒过来
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        //此时s2当中一定有元素
        return s2.peek();
    }
    public boolean empty(){
        return s1.empty()&&s2.empty();
    }
}
