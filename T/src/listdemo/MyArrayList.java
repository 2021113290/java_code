package listdemo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-28
 * Time: 21:44
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY=10;
    public MyArrayList(){
        this.elem=new int[DEFAULT_CAPACITY];
    }
    //打印顺序表，只需要打印usedSize下标就可以了
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }
    public boolean isFull(){
        //这里的usedSize必须和elem.length
        return usedSize==elem.length;
    }
    //新增元素，默认在数组最后添加
    public void add(int data){
        if(isFull()){
            elem= Arrays.copyOf(elem,elem.length*2);
        }
        elem[usedSize++]=data;
    }
    //在pos位置新增元素
    private void checkAddPos(int pos){
        if (pos<0||pos>usedSize){
            throw new PosIndexNotLegalException("POS位置不合法");
        }
    }//检查pos位置是否合法
    public void add(int pos,int data){
        try {
            checkAddPos(pos);
            if(isFull()){
                elem= Arrays.copyOf(elem,elem.length*2);
            }
            for (int i = usedSize-1; i >=pos ; i--) {
                elem[i+1]=elem[i];
            }
            elem[pos]=data;
            usedSize++;
        }catch (PosIndexNotLegalException e){
            e.printStackTrace();
        }
    }
    //判断是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i < usedSize; i++) {
            if (elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int indexOf(int toFind){
        for (int i = 0; i < usedSize; i++) {
            if (elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素、
    private void checkGetPos(int pos){
            if (pos<0||pos>=usedSize){
                throw new PosIndexNotLegalException("POS位置不合法");
            }
    }
    public int get(int pos){
        int retVal=-1;
        try {
            checkGetPos(pos);
            retVal=elem[pos];
        }catch (PosIndexNotLegalException e){
            e.printStackTrace();
        }
        return retVal;
    }
    public void set(int pos,int value){
        checkGetPos(pos);
        elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int key){
        int index=indexOf(key);
        if (index==-1){
            System.out.println("没有你要删除的数");
            return;
        }
        for (int i = index; i < usedSize-1; i++) {
            elem[i]=elem[i+1];
        }
        usedSize--;
    }
    //获取链表长度
    public int size(){
        return usedSize;
    }
    //清空顺序表
    public void clear(){
        usedSize=0;
    }
}
