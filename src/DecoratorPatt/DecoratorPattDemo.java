package DecoratorPatt;

/**
 * Created by Georgi on 20.7.2017 г..
 */
public class DecoratorPattDemo {

    public static void main(String[] args)
    {
        Shape circle =new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle=new RedShapeDecorator(new Rectangle());

        System.out.println("Shape with normal border.");
        circle.draw();

        System.out.println("\nCircle with red border.");
        redCircle.draw();

        System.out.println("\nRectangle with red border.");
        redRectangle.draw();
    }
}
