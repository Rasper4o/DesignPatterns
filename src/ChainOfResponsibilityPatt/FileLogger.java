package ChainOfResponsibilityPatt;


/**
 * Created by Georgi on 25.7.2017 г..
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level)
    {
        this.level=level;
    }

    @Override
    protected void write (String messages)
    {
        System.out.println("File Logger: "+messages);
    }
}
