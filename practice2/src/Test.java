import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-05-01
 * Time: 22:22
 */
public class Test {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            // 下落的高度和落地的次数
            float h=scanner.nextFloat();
            int n =scanner.nextInt();
            float dis = 0;
            for(int i = 0; i < n; i++){
                dis += h;  //每次加上落下来的距离
                h /= 2; //弹起距离缩短一半
                if(i == n - 1){
                    System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", dis));
                }
                dis += h; //弹上去走的距离
            }
        }
}
