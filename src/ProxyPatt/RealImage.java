package ProxyPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName)
    {
        this.fileName=fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display()
    {
        System.out.println("Displaying: "+ fileName);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading: "+fileName);
    }
}
