import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-04-28
 * Time: 15:01
 */
public class Test {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
    public static void main1(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(1.2,1.5,1.3));
    }

    public static void main2(String[] args) {
        Scanner scaneer=new Scanner(System.in);
        int n= scaneer.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            int q=1;
            for (int j = 1; j <=i ; j++) {
                q*=j;
            }
            sum=sum+q;
        }
        System.out.println(sum);

    }

    public static void main3(String[] args) {
        int a[]={1,1,2,2,3};
        for (int i = 0; i <a.length; i++) {
            int count=0;
            for (int j = 0; j <a.length ; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("出现一次数字是"+a[i]);
            }
        }

    }
    public static  int max(int a,int b){
        return a>b?a:b;
    }
    public static  double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,int c){
        return (a>b?a:b)>c?(a>b?a:b):c;
    }
    public static void main4(String[] args) {
        System.out.println(max(2,3));
        System.out.println(max(1.4,1.5,1));
        System.out.println(max(1.5,1.6));
    }

    public static void main5(String[] args) {
        Scanner scaneer=new Scanner(System.in);
        int n= scaneer.nextInt();
        int q=1;
        for (int j = 1; j <=n ; j++) {
            q*=j;
        }
        System.out.println(q);
    }

    public static void main(String[] args) {

        int[] array={1,2,3,4,5};
        for (int x:array) {
            System.out.println(x+" ");
        }
        String ret=Arrays.toString(array);
        System.out.println(ret);
    }
}

