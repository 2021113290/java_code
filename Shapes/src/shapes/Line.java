package shapes;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-15
 * Time: 22:50
 */
import java.awt.Graphics;

public class Line extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public double getPerimeter() {//获得线的长度
        return Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
    }

    @Override
    public double getArea() {//线没有面积，不用写
        return 0;
    }
}