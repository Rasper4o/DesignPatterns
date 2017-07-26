package ChainOfResponsibilityPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level)
    {
        this.level=level;
    }

    @Override
    protected void write (String messages)
    {
        System.out.println("Standard Console Logger: "+messages);
    }
}
