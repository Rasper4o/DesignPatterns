package AbstractFactory;

import sun.security.provider.SHA;

/**
 * Created by Georgi on 15.7.2017 г..
 */
public class ColorFactory extends AbstractFact{

    @Override
    public Shape getShape (String shapeType)
    {
        return null;
    }

    @Override
    Color getColor (String color)
    {
        if (color==null)
        {
            return null;
        }

        if (color.equalsIgnoreCase("red")) return new Red();
        else
        {
            if (color.equalsIgnoreCase("green")) return new Green();
            else
            {
                if (color.equalsIgnoreCase("blue")) return new Blue();
            }
        }

        return null;
    }
}
