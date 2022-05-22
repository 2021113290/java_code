import java.util.Scanner;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-05-10
 * Time: 23:52
 */
public class Test {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuffer strb = new StringBuffer(str);
        strb.reverse();
        System.out.println(strb.toString());
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();    //读取数字
        int n = 0;    //计数变量
        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1)    //如果末位为1则计数
                n++;
            num = num >>> 1;    //无符号右移
        }
        System.out.println(n);
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 输入字符串和k
            String str = sc.next();
            int k = sc.nextInt();
            // 直接使用String的substring方法输出结果
            System.out.println(str.substring(0, k));
        }
    }

    public static void main4(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
                sum += s[i].length();
            }
        }
        System.out.print(sum);
    }

    public static void main5(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
                sum += s[i].length();
            }
        }
        System.out.print(sum);
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            F(sc.nextInt());
        }
    }


    public static void F(int num) {

//        5x+3y+z/3=100;
//        x+y+z=100;
//        简化得 7x+4y=100;
        int x, y, z, middle;
        for (x = 0; x <= 14; x++) {
            if ((100 - 7 * x) % 4 == 0) {
                y = (100 - 7 * x) / 4;
                z = 100 - x - y;
                System.out.print(x + " ");
                System.out.print(y + " ");
                System.out.print(z + " ");
                System.out.println();
            }
        }
    }

    public class Solution {
        public int[] reOrderArrayTwo(int[] array) {
            int n = array.length;
            int[] res = new int[n];
            //统计奇数个数
            int odd = 0;
            //遍历统计
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 1)
                    odd++;
            }
            //x与y分别表示答案中奇偶数的坐标
            int x = 0, y = odd;
            for (int i = 0; i < n; i++) {
                //奇数在前
                if (array[i] % 2 == 1) {
                    res[x] = array[i];
                    x++;
                    //偶数在后
                } else {
                    res[y] = array[i];
                    y++;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(in.nextLine().replaceAll("[^A-Z]", "").length());
        }
    }
}
