package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 16:53
 */
public class CD extends Item {

    private String artist;
    private int numoftracks;

    public CD(String title, String artist, int numoftracks, int playingtime, String comment) {
        super(title,playingtime,comment);
        this.artist = artist;
        this.numoftracks = numoftracks;
    }

    public void print() {
        super.print();
        System.out.println(":"+artist);
    }

    public static void main(String[] args) {
        CD cd = new CD("cd_1", "art_1", 10, 100, "Nice");
        cd.print();

    }

}

