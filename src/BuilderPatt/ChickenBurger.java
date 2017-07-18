package BuilderPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class ChickenBurger extends Burger {

    @Override
    public String name()
    {
        return "Chicken Burger";
    }

    @Override
    public float price()
    {
        return 5.5f;
    }

}
