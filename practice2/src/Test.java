import java.util.Arrays;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-05-01
 * Time: 22:22
 */
public class Test {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 下落的高度和落地的次数
        float h = scanner.nextFloat();
        int n = scanner.nextInt();
        float dis = 0;
        for (int i = 0; i < n; i++) {
            dis += h;  //每次加上落下来的距离
            h /= 2; //弹起距离缩短一半
            if (i == n - 1) {
                System.out.println(String.format("%.3f", h) + " " + String.format("%.3f", dis));
            }
            dis += h; //弹上去走的距离
        }
    }

    public static void main2(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length - 1; //双指针从首尾开始
        while (left < right) {
            int temp = arr[left]; //交换指针元素
            arr[left] = arr[right];
            arr[right] = temp;
            left++;  //指针向中间靠
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

        public static void main3(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.close();
            //a和b的值互换
            if(a<b) a=a+b-(b=a);
            System.out.printf("%d %d %d %d %d",a+b,a-b,a*b,a/b,a%b);


        }
    public static void main4(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" "); //正则表达式实用性更强( str.split("\\s+"))
        int length = s[s.length - 1].length();
        System.out.println(length);
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i)==' ') { // 或者 if (str.substring(i, i + 1).equals(" ")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
        public static void main6(String[] args){
            Scanner s = new Scanner(System.in);
            String input1= s.nextLine();
            String input2 = s.nextLine();
            String split3 = input1.toUpperCase().replaceAll(input2.toUpperCase(),"");
            System.out.println(input1.length() - split3.length());
        }



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double number = in.nextDouble();
            System.out.println((int) (number + 0.5));
        }
}
