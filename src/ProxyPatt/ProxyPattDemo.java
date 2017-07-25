package ProxyPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class ProxyPattDemo {

    public static void main(String[] args)
    {
        Image image=new ProxyImage("test.jpg");

        image.display();
        System.out.println("");

        image.display(); //image does not load from disk; already exists as a proxy object
    }
}
