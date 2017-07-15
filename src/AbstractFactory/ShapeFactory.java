package AbstractFactory;

/**
 * Created by Georgi on 15.7.2017 г..
 */
public class ShapeFactory extends AbstractFact {

    @Override
    public Shape getShape (String shapeType)
    {
        if (shapeType==null) return null;

        else {
            if (shapeType.equalsIgnoreCase("circle")) return new Circle();

            else {
                if (shapeType.equalsIgnoreCase("rectangle")) return new Rectangle();

                else {
                    if (shapeType.equalsIgnoreCase("square")) return new Square();
                }
            }
        }

        return null;
    }

    @Override
    Color getColor(String color)
    {
        return null;
    }
}
