package PrototypePatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class Square extends Shape {

    public Square()
    {
        type="Square";
    }

    @Override
    public void draw()
    {
        System.out.println("This is inside Square draw()");
    }
}