package BuilderPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class Coke extends ColdDrink {

    @Override
    public String name()
    {
        return "Coke";
    }

    @Override
    public float price()
    {
        return 2.0f;
    }
}
