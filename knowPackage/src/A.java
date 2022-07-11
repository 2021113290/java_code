/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-11
 * Time: 15:53
 */
class Base{
    Base(){
        System.out.println("Base");
    }
}
public class A extends Base{
    public static void main(String[] args) {
        new A();
        new Base();
    }
}
