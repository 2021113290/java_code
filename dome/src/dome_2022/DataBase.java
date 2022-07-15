package dome_2022;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-14
 * Time: 16:54
 */
import java.util.ArrayList;

public class DataBase {

    //	private ArrayList<CD> CDlist = new ArrayList<CD>();
//	private ArrayList<DVD> DVDlist = new ArrayList<DVD>();
    private ArrayList<Item> itemlist = new ArrayList<Item>();


    public void add(Item item) {//增
        itemlist.add(item);
    }
    public void remove(int index){//删
        itemlist.remove(index);
    }
    public void change(int index,Item item){//改
        itemlist.set(index,item);
    }
    public void list() {//打印
        for(Item item : itemlist) {
            item.print();
        }
    }

    public static void main(String[] args) {
        DataBase db = new DataBase();

        db.add(new CD("cd_1", "art_1", 10, 100, "Nice"));
        db.add(new CD("cd_2", "art_2", 10, 100, "Nice"));
        db.add(new CD("cd_2", "art_3", 10, 100, "Nice"));

        db.add(new DVD("dvd_1", "d_1", 100, "Nice"));
        db.add(new DVD("dvd_2", "d_2", 100, "Nice"));
        db.add(new VideoGame("VG_1", 2, 100, "Nice","computer"));
        db.add(new BoardGame("BG_1", 1, 100, "Nice","phone" ));
        db.remove(1);
        db.change(0,new CD("cd_2", "art_2", 10, 100, "Nice"));
        db.list();
    }

}