package FacadePatt;

/**
 * Created by Georgi on 22.7.2017 г..
 */
public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker()
    {
        circle=new Circle();
        square=new Square();
        rectangle=new Rectangle();
    }

    public void drawCircle()
    {
        circle.draw();
    }

    public void drawSquare()
    {
        square.draw();
    }

    public void drawRectangle()
    {
        rectangle.draw();
    }

}
