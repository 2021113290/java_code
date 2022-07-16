package computer_test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 9:20
 */
public class Keybroad implements USB{
    public void open(){//重写
        System.out.println("打开USB键盘");
    }
    public void close(){
        System.out.println("关闭USB键盘");
    }
    public void type(){
        System.out.println("键盘打字");
    }
    public void work(){
        this.type();
    }
}
