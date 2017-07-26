package CommandPatt;

public class CancelDessert implements OrderFood {

    private Dessert dessert;

    public CancelDessert(Dessert dessert)
    {
        this.dessert=dessert;
    }

    public void execute()
    {
        dessert.cancel();
    }
}