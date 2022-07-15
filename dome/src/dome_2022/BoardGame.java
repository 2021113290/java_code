package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 20:34
 */
public class BoardGame extends Game{
    private String platform;
    public BoardGame(String title,  int numberOfPlayers, int playingtime, String comment,String platform){
        super( title,  numberOfPlayers, playingtime, comment);
        this.platform=platform;
    }
    public void print(){
        super.print();
        System.out.println(":"+platform);
    }
}
