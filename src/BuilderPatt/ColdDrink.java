package BuilderPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    public abstract float price();
}
