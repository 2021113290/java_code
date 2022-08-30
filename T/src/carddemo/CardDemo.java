package carddemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-29
 * Time: 20:45
 */
class Card{
    public int rank;//每张牌的数字
    public String suit;//每张牌的花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }//构造方法

    @Override
    public String toString() {
        return suit+" "+rank;
    }
}
public class CardDemo {
    public static  final String[] suits={"♥","♠","♣","♦"};
    //买牌
    public List<Card> buyDeskCard(){
           //有13张牌，每张牌都有四个花色 J,Q,K---11，12，13
        List<Card> cards=new ArrayList<>();
        for (int i = 1; i <=13 ; i++) {
            for (int j = 0; j < 4; j++) {
                Card card=new Card(i,suits[j]);
                cards.add(card);
            }
        }
        return cards;
    }
    //洗牌
    public void shuffle(List<Card> cards){
        for (int i = cards.size()-1; i >0 ; i--) {
            Random random=new Random();
            int index=random.nextInt(i);
            swap(cards,index,i);
        }
    }
    private void swap(List<Card> cards,int i,int j){
        Card tmp=cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,tmp);
    }
    //接牌
    public List<List<Card>> test(List<Card> cards){
        List<Card> hand1=new ArrayList<>();
        List<Card> hand2=new ArrayList<>();
        List<Card> hand3=new ArrayList<>();
        List<List<Card>> hands=new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);
        //3个人 每个人轮流抓5张牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card card=cards.remove(0);
                hands.get(j).add(card);
            }
        }
        return hands;
    }
}
