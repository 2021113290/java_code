import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-04-26
 * Time: 18:54
 */

public class Test {
    public static void main1(String[] args) {
        /*判断素数*/
        int n=9;
        int i=2;
        for(;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {
                System.out.println("no");
                break;
            }
        }
        if(i>Math.sqrt(n))
        {
            System.out.println("yes");
        }
    }

    public static void main2(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        System.out.println("最大公约数是"+b);
    }

    public static void main4(String[] args) {
        int n=-1;/*正负皆可*/
        int count=0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>>1;
        }
        System.out.println(count);
    }

    public static void main5(String[] args) {
        int n=-1;
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        for (int i = 31; i >=1; i-=2) {
            System.out.print((n>>i)&1+" ");
        }
        System.out.println();
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print((n>>i)&1+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*java中的字符串比较*/
    }
}
