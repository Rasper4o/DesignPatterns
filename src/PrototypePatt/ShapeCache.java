package PrototypePatt;

import java.util.Hashtable;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap=new Hashtable<String , Shape>();

    public static Shape getShape(String shapeID)
    {
        Shape cachedShape=shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache()
    {
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square=new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
