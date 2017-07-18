package BuilderPatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class Meal {

    private List<Item> items=new ArrayList<Item>();

    public void addItem(Item item)
    {
        items.add(item);
    }

    public float getCost()
    {
        float cost=0.0f;

        for (Item item:items)
        {
            cost+=item.price();
        }

        return cost;
    }

    public void shotItems()
    {
        for (Item item:items)
        {
            System.out.print("Item: "+item.name());
            System.out.print(", Packing: "+item.packing());
            System.out.println(", Price: "+item.price());
        }
    }
}
