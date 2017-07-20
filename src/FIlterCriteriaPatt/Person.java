package FIlterCriteriaPatt;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person (String name, String gender, String maritalStatus)
    {
        this.name=name;
        this.gender=gender;
        this.maritalStatus=maritalStatus;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public String getMaritalStatus()
    {
        return maritalStatus;
    }
}
