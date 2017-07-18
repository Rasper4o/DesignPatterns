package SingletonPatt;

/**
 * Created by Georgi on 17.7.2017 г..
 */
public class SingleObject {

    private static SingleObject instance =new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance()
    {
        return instance;
    }

    public void showMessage()
    {
        System.out.println("This is Singleton class.");
    }


}
