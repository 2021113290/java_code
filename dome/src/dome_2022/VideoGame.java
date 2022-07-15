package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 20:22
 */
public class VideoGame extends Game{
    private String platform;
    public VideoGame(String title,  int numberOfPlayers, int playingtime, String comment,String platform){
        super( title,  numberOfPlayers, playingtime, comment);
        this.platform=platform;
    }
    public void print(){
        super.print();
        System.out.println(":"+platform);
    }
}
