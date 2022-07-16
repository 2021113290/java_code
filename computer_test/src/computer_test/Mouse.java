package computer_test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 9:16
 */
public class Mouse implements USB{
    public void open(){//重写
        System.out.println("打开USB鼠标");
    }
    public void close(){
        System.out.println("关闭USB鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
    public void work(){
        this.click();
    }
}
