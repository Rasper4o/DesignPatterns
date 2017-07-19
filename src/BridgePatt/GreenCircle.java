package BridgePatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int rad, int x, int y)
    {
        System.out.println("Drawing Circle[color: green, radius: "+rad+" x: "+x+" y: "+y+"]");
    }
}