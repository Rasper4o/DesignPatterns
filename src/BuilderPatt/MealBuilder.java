package BuilderPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class MealBuilder {

    public Meal prepareVegMeal()
    {
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal()
    {
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
