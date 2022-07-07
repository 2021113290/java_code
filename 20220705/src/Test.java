import com.sun.javaws.Main;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:1.任意输入1到100之间的整数，以0结束，然后计算每个数出现的次数。
 * •	定义两个数组a和b，并初始化，执行a=b后，修改b[0]，输出a和b。
 * •	定义一个数组a，并初始化，复制数组a。
 * User: xinyu
 * Date: 2022-07-05
 * Time: 15:57
 */

public class Test {
    public static void main1(String[] args) {
        Scanner input=new Scanner(System.in);
        int []count=new int[101];
        for (int x:count) {
            x=0;
        }
        while(true){
            int n= input.nextInt();
            count[n]++;
            if(n==0)
                break;
        }
        for (int i = 1; i <=100 ; i++) {
            if(count[i]!=0)
            System.out.println(i+"出现"+count[i]+"次");
        }
    }

    public static void main2(String[] args) {
        int []a=new int[10];
        int []b=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=0;
            b[i]=0;
        }
        a=b;
        b[0]=1;
        for (int i = 0; i <10 ; i++) {
            System.out.println(a[i]);
        }
        System.out.println("______________");
        for (int i = 0; i <10 ; i++) {
            System.out.println(b[i]);
        }
    }

    public static void main3(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        for (int i=0; i<b.length; i++)
        {
            b[i] = a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }

    public static void zuoxuan(String n,int k){
        String a=n.substring(0,k);
        String b=n.substring(k);
        System.out.println(b+a);
    }
    public static void main4(String[] args) {
        Scanner input=new Scanner(System.in);
        String n=input.next();
        int k=input.nextInt();
        zuoxuan(n,k);
    }
    public static int balance (String s){
        int num = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='R')
                n++;
            if (s.charAt(i) == 'L')
                n--;
            if (n == 0)
                num++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int k=balance(s);
        System.out.println(k);
    }
}
