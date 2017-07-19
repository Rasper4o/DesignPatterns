package BridgePatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int rad, int x, int y)
    {
        System.out.println("Drawing Circle[color: red, radius: "+rad+" x: "+x+" y: "+y+"]");
    }
}
