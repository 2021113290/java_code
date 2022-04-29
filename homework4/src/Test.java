import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-04-29
 * Time: 23:49
 */
public class Test {
    public static int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
        return fib1(n-1)+fib1(n-2);
        }
    }

    public static int fib2(int n){
        if(n==1||n==2){
            return 1;
        }
        int f1=1;
        int f2=1;
        int f3=2;
        for (int i = 3; i <=n ; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    public static void main1(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("输入要计算第几项");
        int n= scanner.nextInt();
        int ret=fib2(n);
        System.out.println("第"+n+"项的值为"+ret);

        }
public static  int fun (int n){
        int m=0;
        int sum=0;
        if(n!=0){
            m=n%10;
            n=n/10;
            sum=m+fun(n);
        }
        return sum;
}
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        fun(n);
        System.out.println(fun(n));
    }

    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.println(n%10);
    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        print(n);
    }
    public static int sum(int n){
        if(n<0){
            return 0;
        }
        else
            return n+sum(n-1);
    }
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int jiecheng(int n){
        if(n==1)
            return 1;
        else
            return n*jiecheng(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(jiecheng(n));
    }
}


