package BuilderPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class BuilderPattDemo {

    public static void main(String[] args)
    {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.shotItems();
        System.out.println("Total cost: "+vegMeal.getCost());

        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n NonVeg Meal");
        nonVegMeal.shotItems();
        System.out.println("Total cost: "+nonVegMeal.getCost());

    }
}
