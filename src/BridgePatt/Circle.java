package BridgePatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class Circle extends Shape {

    private int x, y, rad;

    public Circle(int x, int y, int rad, DrawAPI drawAPI)
    {
        super(drawAPI);
        this.x=x;
        this.y=y;
        this.rad=rad;
    }

    public void draw()
    {
        drawAPI.drawCircle(rad, x, y);
    }
}
