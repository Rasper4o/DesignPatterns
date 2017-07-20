package DecoratorPatt;

/**
 * Created by Georgi on 20.7.2017 г..
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape=decoratedShape;
    }

    public void draw()
    {
        decoratedShape.draw();
    }
}
