package CommandPatt;

public class OrderDessert implements OrderFood {

    private Dessert dessert;

    public OrderDessert(Dessert dessert)
    {
        this.dessert=dessert;
    }

    public void execute()
    {
        dessert.order();
    }
}