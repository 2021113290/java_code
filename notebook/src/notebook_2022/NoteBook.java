package notebook_2022;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-12
 * Time: 21:52
 */
public class NoteBook{
    private ArrayList<String> notebook = new ArrayList<String>();
    private ArrayList<String> box_notebook=new ArrayList<String>();
    private ArrayList<Integer> box_index=new ArrayList<Integer>();


    public void addNote(String note) {//添加记录
        notebook.add(note);
    }

    public void addNote(String note,int index){
        notebook.add(index,note);
    }
    public int getSize() {//获得记录的数量
        return notebook.size();
    }

    public String getNote(int index) {//根据index得到笔记
        return notebook.get(index);
    }

    public void removeNote(int index) {
        box_notebook.add(getNote(index));
        box_index.add(index);
        notebook.remove(index);

    }
    public void recover(int num) {//参数是要恢复的条数
        while (num != 0) {
            this.addNote(box_notebook.get(box_notebook.size() - 1), box_index.get(box_index.size() - 1));
            box_notebook.remove(box_notebook.size() - 1);
            box_index.remove(box_index.size() - 1);
            num--;

        }
    }
    public void search(String[] keywords){
        for (int i = 0; i < keywords.length; i++) {
            System.out.println("含有关键字"+keywords[i]+"的笔记如下：");
            for (int j = 0; j <notebook.size() ; j++) {
                if(notebook.get(j).contains(keywords[i])){
                    System.out.println(notebook.get(j));
                }
            }
        }
    }

    public String[] list() {
        String[] s = new String[notebook.size()];
//		for(int i=0; i < notebook.size(); i++) {
//			s[i] = notebook.get(i);
//		}/.,[P;/.
        notebook.toArray(s);
        return s;
    }

    public void translate(String noteBook){
        HashMap<String,String> ce=new HashMap<String, String>();
        ce.put("111","oneoneone");
        ce.put("222","twotwotwo");
        ce.put("333","threethreethree");
        Set<String> set=ce.keySet();
        for (String key:set
             ) {

            String value=ce.get(key);
            if(noteBook==key){
                System.out.println(key+"---"+value);

            }

        }

    }
    public void getDateTime(){
        Calendar cal=Calendar.getInstance();
        int y=cal.get(Calendar.YEAR);
        int m=cal.get(Calendar.MONTH);
        int d=cal.get(Calendar.DATE);
        int h=cal.get(Calendar.HOUR_OF_DAY);
        int mi=cal.get(Calendar.MINUTE);
        int s=cal.get(Calendar.SECOND);
        Clock clock=new Clock(h,mi,s,y,m,d);
        clock.start();
        System.out.println(clock.toString());
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        NoteBook nb=new NoteBook();
       nb.addNote("111");
        nb.addNote("222");
        /*
        String[] a = nb.list();
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
            nb.getDateTime();
        }*/



        nb.addNote("222");
        nb.translate(nb.notebook.get(0));
        nb.translate(nb.notebook.get(1));

       /* nb.removeNote(0);*//*
        Scanner input=new Scanner(System.in);
       String[]keywords=new String[3];
        for (int i = 0; i < 3; i++) {
            keywords[i]=input.nextLine();
        }
        nb.search(keywords);*/
////		System.out.println(nb.getSize());
////		System.out.println(nb.getNote(1));
////		nb.removeNote(0);
////		System.out.println(nb.getNote(1));
//
        String[] a = nb.list();
        System.out.println("-------最初------------");
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        nb.removeNote(0);
        a = nb.list();
        System.out.println("-------删除后---------");
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        nb.recover(1);
        a = nb.list();
        System.out.println("-------恢复后--------");
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        /*HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("first");
        System.out.println(hs);*/


    }}




