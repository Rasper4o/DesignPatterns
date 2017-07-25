package ProxyPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName)
    {
        this.fileName=fileName;
    }

    @Override
    public void display()
    {
        if (realImage==null)
        {
            realImage=new RealImage(fileName);
        }

        realImage.display();
    }
}
