package CommandPatt;


public class MainDish {

    String name;

    public MainDish(String name)
    {
        this.name=name;
    }

    public void order()
    {
        System.out.println("Main dish ("+name+") is ordered.");
    }

    public void cancel()
    {
        System.out.println("Main dish ("+name+") is canceled.");
    }
}
