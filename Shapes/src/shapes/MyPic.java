package shapes;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-15
 * Time: 22:50
 */
public class MyPic {
    public static void main(String[] args)
    {
        Picture pic = new Picture(420,300);
        Circle c1 = new Circle(320,40,80);
        Rectangle r1 = new Rectangle(100, 100, 100, 100);
        Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
        Line l1 = new Line(0,205,400,205);
        Circle c2 = new Circle(200,200,50);
        Square s1=new Square(320,40,50);
        Ellipse e1=new Ellipse(320,40,50,60);
        pic.add(c1);
        pic.add(r1);
        pic.add(t1);
        pic.add(l1);
        pic.add(c2);
        pic.add(s1);
        pic.add(e1);
        pic.draw();
        System.out.println(c1.getArea()+"     "+c1.getPerimeter());
        System.out.println(r1.getArea()+"     "+r1.getPerimeter());
        System.out.println(t1.getArea()+"     "+t1.getPerimeter());
        System.out.println(l1.getArea()+"     "+t1.getPerimeter());
        System.out.println(s1.getArea()+"     "+s1.getPerimeter());
        System.out.println(e1.getArea()+"     "+e1.getPerimeter());

    }
}