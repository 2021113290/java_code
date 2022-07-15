package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 16:56
 */
public class Item {
    private String title;
    private int playingtime;
    private String comment;
    private boolean gotit=true;

    public Item(String title, int playingtime, String comment) {
        //super();
        this.title = title;
        this.playingtime = playingtime;
        this.comment = comment;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public void print() {
        // TODO Auto-generated method stub
        System.out.print(title);
    }
}
