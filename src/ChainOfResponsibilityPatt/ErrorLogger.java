package ChainOfResponsibilityPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level)
    {
        this.level=level;
    }

    @Override
    protected void write (String messages)
    {
        System.out.println("Error Console Logger: "+messages);
    }
}