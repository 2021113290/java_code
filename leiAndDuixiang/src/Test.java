/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-09
 * Time: 8:20
 */
public class Test{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt = " + cnt);
    }
    static{
        cnt /=3;
    };
}