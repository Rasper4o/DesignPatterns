package ChainOfResponsibilityPatt;

/**
 * Created by Georgi on 25.7.2017 г..
 */
public class CashDispenser {

    private int denominator;
    private CashDispenser next=null;

    public CashDispenser (int val)
    {
        this.denominator=val;
    }

    public void setNextDispenser (CashDispenser dispenser)
    {
        if (next==null) next=dispenser;
        else  next.setNextDispenser(dispenser);
    }

    public void dispense (int amount)
    {
        if (amount>=denominator)
        {
            int num=amount/denominator;
            int balance=amount%denominator;

            System.out.println(num+"*"+denominator+"$");

            if (balance!=0) next.dispense(balance);
        }
        else next.dispense(amount);
    }
}
