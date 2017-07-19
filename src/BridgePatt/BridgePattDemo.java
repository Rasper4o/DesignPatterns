package BridgePatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class BridgePattDemo {

    public static void main (String [] args)
    {
        Shape redCircle=new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle=new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
