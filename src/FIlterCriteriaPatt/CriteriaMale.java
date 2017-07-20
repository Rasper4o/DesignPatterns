package FIlterCriteriaPatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> people)
    {
        List<Person> malePeople=new ArrayList<Person>();

        for (Person person:people)
        {
            if (person.getGender().equalsIgnoreCase("male"))
            {
                malePeople.add(person);
            }
        }

        return malePeople;
    }
}
