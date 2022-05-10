import java.util.Scanner;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-05-10
 * Time: 23:52
 */
public class Test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            StringBuffer strb = new StringBuffer(str);
            strb.reverse();
            System.out.println(strb.toString());
        }
}
