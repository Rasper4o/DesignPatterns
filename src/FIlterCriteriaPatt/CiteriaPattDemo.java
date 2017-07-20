package FIlterCriteriaPatt;

import java.util.*;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class CiteriaPattDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("John", "male", "married"));
        people.add(new Person("Dolores", "female", "married"));
        people.add(new Person("Bert", "male", "single"));
        people.add(new Person("Susanna", "female", "single"));
        people.add(new Person("Mercy", "female", "married"));
        people.add(new Person("Jack", "male", "single"));
        people.add(new Person("Ana", "female", "married"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria married = new CriteriaMarried();
        Criteria marriedMale = new AndCriteria(married, male);
        Criteria marriedOrFemale = new OrCriteria(married, female);


        System.out.println("Males: ");
        printPeople(male.meetCriteria(people));

        System.out.println("Females: ");
        printPeople(female.meetCriteria(people));

        System.out.println("Married people: ");
        printPeople((married.meetCriteria(people)));

        System.out.println("Married men: ");
        printPeople(marriedMale.meetCriteria(people));

        System.out.println("Married people or females: ");
        printPeople(marriedOrFemale.meetCriteria(people));


    }

    public static void printPeople (List<Person> people)
    {
        for (Person person:people)
        {
            System.out.println("Person: [Name: "+person.getName()+", Gender: "+person.getGender()+
                    ", Marital status: "+person.getMaritalStatus()+"]");
        }
    }

}

