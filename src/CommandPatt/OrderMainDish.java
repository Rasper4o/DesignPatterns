package CommandPatt;

public class OrderMainDish implements OrderFood {

    private MainDish mainDish;

    public OrderMainDish(MainDish mainDish)
    {
        this.mainDish=mainDish;
    }

    public void execute()
    {
        mainDish.order();
    }
}
