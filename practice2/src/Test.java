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

    public static void main(String[] args) {
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
}
