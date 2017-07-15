package AbstractFactory;

/**
 * Created by Georgi on 15.7.2017 г..
 */
public class AbstractFactPattDemo {

    public static void main (String[] args)
    {
        AbstractFact shapeFactory=FactoryProducer.getFactory("shape");

        Shape shape1=shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2=shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("square");
        shape3.draw();

        AbstractFact colorFactory=FactoryProducer.getFactory("color");

        Color color1=colorFactory.getColor("red");
        color1.fill();

        Color color2=colorFactory.getColor("green");
        color2.fill();

        Color color3=colorFactory.getColor("blue");
        color3.fill();
    }
}
