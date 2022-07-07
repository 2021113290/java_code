import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:1.实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 * 2.创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
 * 3.给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * 4.冒泡排序
 * 5.给定一个整型数组, 判定数组是否有序（递增
 * 6.给定一个有序整型数组, 实现二分查找
 * 7.实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 * 8.实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
 * User: xinyu
 * Date: 2022-07-07
 * Time: 8:54
 */
public class bite220506 {
    public static void main1(String[] args) {
        int []arr={1,2,3};
        transform(arr);
    }
    public static void transform(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=2;
            System.out.println(arr[i]);
        }
    }

    public static void main2(String[] args) {
        int[]arr=new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            System.out.println(arr[i]);
        }
    }

    public static void main3(String[] args) {
        int[]nums={1,2,3,4};
        Scanner target=new Scanner(System.in);
        int a= target.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==a){
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }
        System.out.println("没有找到");
    }
    public static void main4(String[] args) {
        int[]arr={4,3,2,6,5};
        bubble_sort(arr);
    }
    public static void bubble_sort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }

    public static void main5(String[] args) {
        int[]arr={1,2,1,4};
        bubble_zeng(arr);

    }
    public static void bubble_zeng(int[]arr){
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length -1-i; j++) {
                    if(arr[j]>arr[j+1]){
                        System.out.println("不是有序");
                        return;
                    }
                    }
                }
        System.out.println("有序");
            }

    public static void main6(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(search(nums, nums.length, 4));
    }
    public static int search(int nums[], int size, int target) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else
                return middle;
        }
    return -1;
    }

    public static void main7(String[] args) {
        int[]arr={1,2,3,4};
        for (int x:copyOf(arr)
             ) {
            System.out.println(x);
        }
    }
    public static int[] copyOf(int[]arr){
        int []arr1=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String a = toString (arr);
        System.out.println(a);
    }

    public static String toString(int[] arr) {
        String a = "[";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
            if(i != arr.length -1) {
                a += ",";
            }
        }
        a += "]";
        return a;

    }

}
