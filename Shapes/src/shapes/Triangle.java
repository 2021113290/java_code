package shapes;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-15
 * Time: 22:51
 */
import java.awt.Graphics;

public class Triangle extends Shape {
    private int[] x = new int[3];
    private int[] y = new int[3];

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        x[0] = x1; x[1] = x2; x[2] = x3;
        y[0] = y1; y[1] = y2; y[2] = y3;
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(x, y, x.length);
    }
    public double getPerimeter() {
        double s1 = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
        double s2 = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));
        double s3 = Math.sqrt(Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2));
        return s1+s2+s3;
    }

    //利用海伦公式计算面积
    @Override
    public double getArea() {
        double s1 = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
        double s2 = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));
        double s3 = Math.sqrt(Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2));
        double s = (s1 + s2 + s3) / 2;

        return  Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

}
