package CompositePatt;

/**
 * Created by Georgi on 20.7.2017 г..
 */
public class CompositePattDemo {

    public static void main(String[] args)
    {
        Employee CEO=new Employee("John", "CEO", 30000);

        Employee headSales=new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing=new Employee("Michael", "Head Marketing", 20000);

        Employee clerk1=new Employee("Eva", "Marketing", 10000);
        Employee clerk2=new Employee("Helga", "Marketing", 10000);

        Employee salesExecutive1=new Employee("Mike", "Sales", 10000);
        Employee salesExecutive2=new Employee("Brandon", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        System.out.println(CEO);

        for (Employee headEmployee:CEO.getSubordinates())
        {
            System.out.println(headEmployee);

            for (Employee employee:headEmployee.getSubordinates())
            {
                System.out.println(employee);
            }
        }
    }
}
