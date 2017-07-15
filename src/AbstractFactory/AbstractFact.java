package AbstractFactory;

/**
 * Created by Georgi on 15.7.2017 г..
 */
public abstract class AbstractFact {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
