package shapes;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-07-16
 * Time: 0:06
 */
public class Square extends Shape{//正方形
    public int x;
    public int y;
    public int side;
    public Square(int x,int y,int side){
        this.x=x;
        this.y=y;
        this.side=side;
    }
    public void draw(Graphics g){
        g.drawRect(x,y,side,side);
    }
    public double getPerimeter(){
        return 4*side;
    }
    public double getArea(){
        return side*side;
    }
}
