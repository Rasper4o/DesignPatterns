package CommandPatt;
//This is the invoker/command class
public class Waiter {

    public void execute(OrderFood orderFood)
    {
        orderFood.execute();
    }
}
