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
    public static void main2(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();    //读取数字
        int n = 0;    //计数变量
        for(int i=0; i < 32; i++){
            if((num&1) == 1)    //如果末位为1则计数
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
        public static void main4(String arg[]){
            Scanner sc=new Scanner(System.in);
            int sum=0;
            while(sc.hasNext()){
                String str=sc.nextLine();
                String[] s=str.split(" ");
                for(int i=0;i<s.length;i++){
                    sum+=s[i].length();
                }
            }
            System.out.print(sum);
        }
        public static void main(String arg[]){
            Scanner sc=new Scanner(System.in);
            int sum=0;
            while(sc.hasNext()){
                String str=sc.nextLine();
                String[] s=str.split(" ");
                for(int i=0;i<s.length;i++){
                    sum+=s[i].length();
                }
            }
            System.out.print(sum);
        }
}
