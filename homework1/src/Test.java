import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-04-27
 * Time: 22:06
 */
public class Test {
    public static void main1(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=3;
        while(n!=0)
        {
            String password=scanner.nextLine();
            if(password.equals("123456")){
                System.out.println("登陆成功");
                break;
            }
            else{
                System.out.println("输入错误，请重新输入");
                n--;

            }
        }
        if(n==0){
            System.out.println("退出程序");
        }
    }

    public static void main3(String[] args) {

        for (int i = 0; i <=999; i++) {
            int n=0;
            int ret=i;
            while(ret!=0){
                ret/=10;
                n++;
            }
            ret=i;
            int sum=0;
            while(ret!=0){
               sum+= Math.pow(ret%10,n);
               ret/=10;
            }
            if(sum==i){
                System.out.println("水仙花数"+i);
            }
        }
    }

    public static void main4(String[] args) {
        Scanner scaneer=new Scanner(System.in);
        while(scaneer.hasNext()){
            int n=scaneer.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j||i+j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void main5(String[] args) {
        int a=24;
        int b=8;
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        System.out.println(b);
    }

    public static void main6(String[] args) {
        for (int i = 1000; i <=2000 ; i++) {
            if(i%400==0||(i%4==0&&i%100!=0)){
                System.out.println(i+"是闰年");
            }
        }
    }
    public static void main7(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            int j;
            for ( j = 2; j <i ; j++) {
                if(i%j==0){
                    break;
                }
            }
            if(j==i)
                System.out.println(i+"是素数");
        }
    }

    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        int j;
        for ( j = 2; j <i ; j++) {
            if(i%j==0){
                break;
            }
        }
        if(j==i)
            System.out.println(i+"是素数");
    }

    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println("数字9的个数为"+count);
    }
}
