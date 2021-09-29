package ru.Filter;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.Person.Person;
@Component
public class Filter implements IFilter {
    @Value("${Filter.minAge}")
    private int minAge;
    @Value("${Filter.maxAge}")
    private int maxAge;
    @Value("${Filter.gender}")
    private String gender;
    @Override
    public List<String> filtred(List<Person> persons){
        return persons.stream()
                .filter(person -> person.age >=minAge)
                .filter(person -> person.age <=maxAge)
                .filter(person -> person.gender.equals(gender))
                .map(person -> person.guid)
                .collect(Collectors.toList());
    }
}
