import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-30
 * Time: 20:48
 */
public class yanghui {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ret.add(list);
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow=new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow=ret.get(i-1);
            for (int j = 1; j < i; j++) {
                int num=prevRow.get(j)+prevRow.get(j-1);
                curRow.add(num);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    public static void main(String[] args) {
        List<List<Integer>> ret=generate(6);
        System.out.println(ret);

    }
}
