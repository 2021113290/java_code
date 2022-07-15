package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 16:55
 */
public class DVD extends Item {

    private String director;

    public DVD(String title, String director, int playingtime, String comment) {
        super(title,playingtime,comment);
        this.director = director;

    }


    public void print() {
        super.print();
        System.out.println(":"+director);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DVD dvd=new DVD("1","2",3,"4");
        dvd.print();
    }

}

