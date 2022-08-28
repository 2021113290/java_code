/**
 * Created with IntelliJ IDEA.
 * Description:写一个泛型类，找出数组当中的最大值
 * User: xinyu
 * Date: 2022-08-28
 * Time: 16:49
 */
class Alg<T extends Comparable<T>>{
    public T findMaxVal(T[] array){
        T maxVal=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(maxVal)>0){
                maxVal=array[i];
            }
        }
        return maxVal;
    }
}
class Alg2<T>{
    //静态方法
    public static <T extends Comparable<T>> T findMaxVal(T[] array){
        T maxVal=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(maxVal)>0){
                maxVal=array[i];
            }
        }
        return maxVal;
    }
}
class Alg3{
    //泛型方法：成员方法
    public <T extends Comparable<T>> T findMaxVal2(T[] array){
        T maxVal=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(maxVal)>0){
                maxVal=array[i];
            }
        }
        return maxVal;
    }
}
public class Test {
    public static void main(String[] args) {
        Alg3 alg3=new Alg3();
        Integer[]array={32,45,67,98};
        int val=alg3.findMaxVal2(array);
        System.out.println(val);
    }
    public static void main2(String[] args) {
        Integer[]array={32,45,67,98};
        int val=Alg2.findMaxVal(array);
        System.out.println(val);
    }
    public static void main1(String[] args) {
        Alg<Integer> alg=new Alg<>();
        Integer[]array={32,45,67,98};
        int val=alg.findMaxVal(array);
        System.out.println(val);
    }
}
