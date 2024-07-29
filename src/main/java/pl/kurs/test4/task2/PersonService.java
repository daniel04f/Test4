package pl.kurs.test4.task2;

import java.util.*;

public class PersonService {
    public static Person getTheOldestWomen(List<Person> people) throws NoWomenException {
        return Optional.ofNullable(people)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(Person::isWoman)
                .max(Comparator.comparingInt(Person::getAge))
                .orElseThrow(() -> new NoWomenException("Nie znaleziono żadnej kobiety na liście"));
    }
}
