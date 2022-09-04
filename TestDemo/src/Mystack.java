import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-09-03
 * Time: 18:32
 */
public class Mystack {
    public int[] elem;
    //当前栈当中存储的有效的数据个数，也可以当作 当前可以存放数据元素的下标
    public int usedSize;
    public static final int DEFAULT_SIZE=10;
    public Mystack(){
        elem=new int[DEFAULT_SIZE];
    }
    //压栈

    public void push(int val){
        //1、判断当前栈是否满
        if (isFull()){
            elem= Arrays.copyOf(elem,2*elem.length);
        }
        //存放到当前下标，同时usedSize需要自增
        elem[usedSize]=val;
        usedSize++;
    }
    //判断当前栈是否是满的
    public boolean isFull(){
        if (usedSize==elem.length){
            return true;
        }
        return false;
    }
    //删除栈顶元素
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException("栈为空了");
        }
        int oldVal=elem[usedSize-1];
        usedSize--;
        return oldVal;
    }
    //判断是否为空
    public boolean isEmpty(){
        return usedSize==0;
    }
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException("栈为空了");
        }
        return elem[usedSize-1];
    }
  //查找，就是数组逆向遍历
    //括号匹配
    public boolean isValid(String s){//时空复杂度o（n）
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }else {
                //说明ch里面是右括号
                if (stack.empty()){
                    //右括号多
                    return false;
                }
                char top=stack.peek();
                if (ch==')'&&top=='('||ch=='}'&&top=='{'||ch==']'&&top=='['){
                    //只能说明当前的字符是匹配的
                    stack.pop();
                }else {
                    //左右括号不匹配
                    return false;
                }
            }
        }
        if (stack.empty()){
            return true;
        }else {
            //左括号多
            return false;
        }
    }
    //逆波兰表达式求值
    public int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        for (String x:tokens
             ) {
            //不是加减乘除
            if (!isOperation(x)){
                stack.push(Integer.parseInt(x));
            }else {
                int num2=stack.pop();
                int num1=stack.pop();
                switch (x){
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num1-num2);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                     case "/":
                        stack.push(num1/num2);
                        break;

                }
            }

        }
        return stack.pop();
    }
    private boolean isOperation(String opera){
        if (opera.equals("+")||opera.equals("-")||opera.equals("*")||opera.equals("/")){
            return true;
        }
        return false;
    }
    //不可能的出栈顺序
    public boolean IsPopOrder(int[] pushA,int []popA){
         if (pushA.length==0||popA.length==0){
             return false;
         }
         Stack<Integer> stack=new Stack<>();
         int j=0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (j<popA.length&&!stack.empty()&&stack.peek().equals(popA[j])){
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
