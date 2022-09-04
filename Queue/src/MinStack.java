//当我们需要出站的时候，除了出普通那个站的元素之外，
// 每次出的时候，都要和最小栈的栈顶元素进行比较，
//如果相等，那么最小站当中也需要出数据。
//这样才能保证，每次获取最小值的时候，正好在最小栈的栈顶
/*入栈的时候，我们不仅需要往普通栈中存储元素，我们还需要进行判断，
如果入栈的元素小于等于最小栈的栈顶元素，那么就把该元素放到最小栈

 */

import java.util.Stack;

class MinStack {
    private Stack<Integer> s;//普通栈
    private Stack<Integer> minStack;//维护当前栈的最小栈
    public MinStack() {
        s=new Stack<>();
        minStack=new Stack<>();
    }
    //入栈
    public void push(int val) {
        s.push(val);//普通栈必须放
        if (minStack.empty()){//直接放在最小栈一份
            minStack.push(val);
        }else{
            int peekV=minStack.peek();
            if(val<=peekV){
                minStack.push(val);
            }
        }
    }
    //出栈
    public void pop() {
        if (!s.empty()){
            int popV=s.pop();
            int peekVMinS=minStack.peek();
            if (popV==peekVMinS){
                minStack.pop();
            }
        }

    }
    //获取普通栈的栈顶元素
    public int top() {
        if (!s.empty()){
            return s.peek();
        }
        return -1;

    }
    //获取最小栈的栈顶元素
    public int getMin() {
        if (!minStack.empty()){
            return minStack.peek();
        }
        return -1;
    }
}