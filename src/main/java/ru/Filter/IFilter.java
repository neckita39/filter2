package ru.Filter;
import ru.Person.Person;

import java.util.List;

public interface IFilter {
    public List<String> filtred(List<Person> persons);
}
