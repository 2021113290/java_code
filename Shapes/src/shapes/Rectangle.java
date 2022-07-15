package shapes;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-15
 * Time: 22:50
 */
import java.awt.Graphics;

public class Rectangle extends Shape {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
