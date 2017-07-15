package AbstractFactory;

/**
 * Created by Georgi on 15.7.2017 г..
 */
public class FactoryProducer {

    public static AbstractFact getFactory (String choice)
    {
        if (choice.equalsIgnoreCase("shape")) return new ShapeFactory();
        else
        {
            if (choice.equalsIgnoreCase("color")) return new ColorFactory();
        }

        return null;
    }
}
