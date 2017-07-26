package InterpreterPatt;

import com.sun.javafx.applet.ExperimentalExtensions;

public class InterpreterPattDemo {

    public static Expression getMaleExpression()
    {
        Expression jeremy=new TerminalExpression("Jeremy");
        Expression richard=new TerminalExpression("Richard");

        return new OrExpression(jeremy, richard);
    }

    public static Expression getMarriedWomanExpression()
    {
        Expression diana=new TerminalExpression("Diana");
        Expression married=new TerminalExpression("Married");

        return new AndExpression(diana, married);
    }

    public static void main(String[] atgs)
    {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedWomanExpression();

        System.out.println("Jeremy is a man? "+isMale.interpret("Jeremy"));
        System.out.println("Diana is married? "+isMarriedWoman.interpret("Diana Married"));
    }
}
