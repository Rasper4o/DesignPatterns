package FIlterCriteriaPatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> people)
    {
        List<Person> femalePeople=new ArrayList<Person>();

        for (Person person:people)
        {
            if (person.getGender().equalsIgnoreCase("female"))
            {
                femalePeople.add(person);
            }
        }

        return femalePeople;
    }
}