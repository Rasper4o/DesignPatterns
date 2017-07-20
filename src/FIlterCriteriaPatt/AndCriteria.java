package FIlterCriteriaPatt;

import java.util.List;

/**
 * Created by Georgi on 19.7.2017 г..
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria)
    {
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }

    @Override
    public List<Person> meetCriteria (List<Person> people)
    {
        List<Person> firstCriteriaPeople=criteria.meetCriteria(people);
        return otherCriteria.meetCriteria(firstCriteriaPeople);
    }
}
