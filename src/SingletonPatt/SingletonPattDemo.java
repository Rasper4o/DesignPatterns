package SingletonPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class SingletonPattDemo {

    public static void main(String[] args)
    {
        SingleObject object =SingleObject.getInstance();

        object.showMessage();
    }
}
