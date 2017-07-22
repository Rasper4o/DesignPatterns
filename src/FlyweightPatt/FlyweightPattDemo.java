package FlyweightPatt;

/**
 * Created by Georgi on 22.7.2017 г..
 */
public class FlyweightPattDemo {

    private static final String[] colors={"red", "green", "blue", "white", "black"};

    public static void main(String[] args)
    {
        for(int i=0; i<20; i++)
        {
            Circle circle=(Circle)ShapeFactory.getCircle(randomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String randomColor()
    {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX()
    {
        return (int)(Math.random()*100);
    }

    private static int getRandomY()
    {
        return (int)(Math.random()*100);
    }
}
