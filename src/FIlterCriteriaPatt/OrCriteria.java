package FIlterCriteriaPatt;

import java.util.List;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria)
    {
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }

    public List<Person> meetCriteria (List<Person> people)
    {
        List<Person> firstCriteriaPeople=criteria.meetCriteria(people);
        List<Person> otherCriteriaPeople=otherCriteria.meetCriteria(people);

        for (Person person:otherCriteriaPeople)
        {
            if (!firstCriteriaPeople.contains(person))
            {
                firstCriteriaPeople.add(person);
            }
        }

        return firstCriteriaPeople;
    }
}
