package FIlterCriteriaPatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class CriteriaMarried implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> people)
    {
        List<Person> marriedPeople=new ArrayList<Person>();

        for (Person person:people)
        {
            if (person.getMaritalStatus().equalsIgnoreCase("married"))
            {
                marriedPeople.add(person);
            }
        }

        return marriedPeople;
    }
}