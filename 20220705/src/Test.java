import com.sun.javaws.Main;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:1.任意输入1到100之间的整数，以0结束，然后计算每个数出现的次数。
 * •	定义两个数组a和b，并初始化，执行a=b后，修改b[0]，输出a和b。
 * •	定义一个数组a，并初始化，复制数组a。
 * 1):左旋转字符串2)：数组中的字符串匹配3)：分割平衡字符串4)：重新格式化字符串
 * User: xinyu
 * Date: 2022-07-05
 * Time: 15:57
 */

public class Test {
    public static void main1(String[] args) {
        Scanner input=new Scanner(System.in);
        int []count=new int[101];
        for (int x:count) {
            x=0;//用foreach初始化数组
        }
        while(true){//计算每个数出现的次数
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
        int []a=new int[10];//定义两个数组
        int []b=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=0;//初始化
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
            b[i] = a[i];//复制
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }

    public static void zuoxuan(String n,int k){//左旋字符串，使用substring
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
            if (s.charAt(i)=='R')//str.charAt(0)检索str中的第一个字符
                n++;
            if (s.charAt(i) == 'L')
                n--;
            if (n == 0)
                num++;
        }
        return num;
    }
    public static void main8(String[] wordsm) {
        ArrayList list = new ArrayList();
        //i为每次循环需要比较的值
        Scanner input=new Scanner(System.in);
        String str=input.next().toString();
        String[] words=str.split(",");
       // for (int i = 0; i <words.length ; i++) {
         //   System.out.println(words[i]+" ");
        //}
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j || words[i].length() >= words[j].length()) continue;

                if (words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        System.out.println(list);

    }
    public static void main9(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int k=balance(s);
        System.out.println(k);
    }

        public static String reformat(String s) {//重新格式化字符串
            ArrayList<String> nums = new ArrayList<String>();
            ArrayList<String> chars = new ArrayList<String>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a') {
                    chars.add(s.substring(i, i + 1));
                } else {
                    nums.add(s.substring(i, i + 1));
                }
            }
            if (Math.abs(nums.size() - chars.size()) > 1) {
                return "";
            }
            String o = "";
            if (nums.size() < chars.size()) {
                for (int i = 0; i < nums.size(); i++) {
                    o = o + chars.get(i);
                    o = o + nums.get(i);
                }
                o = o + chars.get(chars.size() - 1);
            }
            if (nums.size() > chars.size()) {
                for (int i = 0; i < chars.size(); i++) {
                    o = o + nums.get(i);
                    o = o + chars.get(i);
                }
                o = o + nums.get(nums.size() - 1);
            }
            if (nums.size() == chars.size()) {
                for (int i = 0; i < chars.size(); i++) {
                    o = o + nums.get(i);
                    o = o + chars.get(i);
                }
            }
            return o;

        }
        public static void main(String[] args) {
            String s = "covid2019";
            System.out.println(reformat(s));
        }
}
