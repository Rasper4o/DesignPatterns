package PrototypePatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class Circle extends Shape {

    public Circle()
    {
        type="Circle";
    }

    @Override
    public void draw()
    {
        System.out.println("This is inside Circle draw()");
    }
}