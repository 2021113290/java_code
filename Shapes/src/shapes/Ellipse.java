package shapes;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 0:15
 */
public class Ellipse extends Shape {
    public int x;
    public int y;
    public int a;
    public int b;

    public Ellipse(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(x,y,a,b);

    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI+4*Math.abs(a-b);
    }

    @Override
    public double getArea() {
        return Math.PI*a*b;
    }
}
