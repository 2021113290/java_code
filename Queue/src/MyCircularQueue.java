class MyCircularQueue {
    public int[] elem;
    //public int usedSize;
    public int front;//对头下标
    public int rear;//队尾下标
    public MyCircularQueue(int k) {
        this.elem=new int[k+1];
    }
    //入队
    public boolean enQueue(int value) {
        //放过之前判断满了没
        if (isFull()){
            //如果扩容，就要更新front和rear，本题不用扩容
            return false;

        }
        this.elem[rear]=value;
        //千万不可以rear++
        rear=(rear+1)%elem.length;
        return true;
    }
    //出队
    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        front=(front+1)%elem.length;
        return true;
    }
    //获取队头元素
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return elem[front];
    }
    //获取队尾元素
    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        int index=(rear==0)?elem.length-1:rear-1;
        return elem[rear-1];
    }
    
    public boolean isEmpty() {
        return rear==front;
    }
    
    public boolean isFull() {
        return (rear+1)%elem.length==front;
    }

}
