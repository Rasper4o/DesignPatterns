package FactoryPatt;

/**
 * Created by Georgi on 15.7.2017 г..
 */
public class FactoryPatternDemo {

    public static void main(String[] args)
    {
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape1=shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2=shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("square");
        shape3.draw();
    }
}
