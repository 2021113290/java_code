package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 20:17
 */
public class Game extends Item{
    private int numberOfPlayers;
    public Game(String title,  int numberOfPlayers, int playingtime, String comment){
        super(title,playingtime,comment);
        this.numberOfPlayers=numberOfPlayers;
    }
    public void print(){
        super.print();
        System.out.println(":"+numberOfPlayers);
    }
}
