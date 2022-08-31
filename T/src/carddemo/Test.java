package carddemo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-29
 * Time: 20:58
 */
public class Test {

    public static void main(String[] args) {
        CardDemo cardDemo=new CardDemo();
        List<Card> ret=cardDemo.buyDeskCard();
        System.out.println(ret);
        System.out.println("洗牌：");
        cardDemo.shuffle(ret);
        System.out.println(ret);
        List<List<Card>> ret2=cardDemo.test(ret);
        for (int i = 1; i <= ret2.size(); i++) {
            System.out.println("第"+i+"个人的牌，"+ret2.get(i-1));
        }
        System.out.println("剩余的牌："+ret);
    }
}
