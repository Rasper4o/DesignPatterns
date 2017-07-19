package BridgePatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI)
    {
        this.drawAPI=drawAPI;
    }

    public abstract void draw();
}
