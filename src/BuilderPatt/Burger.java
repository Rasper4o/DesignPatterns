package BuilderPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing()
    {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
