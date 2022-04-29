import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-04-29
 * Time: 23:49
 */
public class Test {


        public static long feibonaqie(long number)
        {
            if (number==0||number==1)
            {
                return number;
            }
            else
            {
                return feibonaqie(number-1)+feibonaqie(number-2);
            }
        }
        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入需要计算第几项的值：");
            long number = input.nextLong();
            System.out.println("第"+number+"项的斐波那锲值为："+feibonaqie(number));
        }

}
