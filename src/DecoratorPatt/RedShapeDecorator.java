package DecoratorPatt;

/**
 * Created by Georgi on 20.7.2017 г..
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator (Shape decoratedShape)
    {
        super(decoratedShape);
    }

    @Override
    public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape)
    {
        System.out.println("Border color: Red");
    }
}
