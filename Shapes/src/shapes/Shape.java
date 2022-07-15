package shapes;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-15
 * Time: 22:50
 */
import java.awt.Graphics;

public abstract class Shape {

    public abstract void draw(Graphics g);
    public abstract double getPerimeter();//计算周长的抽象函数
    public abstract double getArea();//计算面积的抽象函数
}

