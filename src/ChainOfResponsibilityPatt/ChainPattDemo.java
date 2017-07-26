package ChainOfResponsibilityPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class ChainPattDemo {

    private static AbstractLogger getChainOfLoggers()
    {
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args)
    {
        AbstractLogger loggerChain=getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is info.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is error information.");
    }
}
