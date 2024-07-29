package pl.kurs.test4.task2;

import java.util.*;
import java.util.function.Predicate;

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

    public static double getAvgPersonsAge(List<Person> people) {
        return Optional.ofNullable(people)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    public static double getAvgMenAge(List<Person> people) {
        return Optional.ofNullable(people)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(x -> !x.isWoman())
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    public static double getAvgWomanAge(List<Person> people) {
        return Optional.ofNullable(people)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(Person::isWoman)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    public static double getAvgAgeForSpecificGender(List<Person> people, Predicate<Person> predicate) {
        return Optional.ofNullable(people)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(predicate)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
}
