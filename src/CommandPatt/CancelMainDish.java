package CommandPatt;

public class CancelMainDish implements OrderFood {

    private MainDish mainDish;

    public CancelMainDish(MainDish mainDish)
    {
        this.mainDish=mainDish;
    }

    public void execute()
    {
        mainDish.cancel();
    }
}
