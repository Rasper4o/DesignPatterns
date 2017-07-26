package CommandPatt;



public class OrderFoodDemo {

    public static void main(String[] args)
    {
        Waiter waiter=new Waiter();

        MainDish dish1=new MainDish("Pizza");

        OrderMainDish orderMainDish1=new OrderMainDish(dish1);
        waiter.execute(orderMainDish1);

        MainDish dish2=new MainDish("Burger");

        OrderMainDish orderMainDish2=new OrderMainDish(dish2);
        waiter.execute(orderMainDish2);

        CancelMainDish cancelMainDish1=new CancelMainDish(dish1);
        waiter.execute(cancelMainDish1);

        Dessert dessert1=new Dessert("Caramel cream");

        OrderDessert orderDessert1=new OrderDessert(dessert1);
        waiter.execute(orderDessert1);
    }
}
