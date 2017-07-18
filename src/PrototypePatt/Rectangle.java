package PrototypePatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class Rectangle extends Shape {

    public Rectangle()
    {
        type="Rectangle";
    }

    @Override
    public void draw()
    {
        System.out.println("This is inside Rectangle draw()");
    }
}
