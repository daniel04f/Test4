package pl.kurs.test4.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonRunner {
    public static void main(String[] args) throws NoWomenException {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Anna", "Kowalska", "Warszawa", 25));
        peopleList.add(new Person("Jan", "Nowak", "Krakow", 57));
        peopleList.add(new Person("Katarzyna", "Wisniewska", "Gdansk", 33));
        peopleList.add(new Person("Tomasz", "Wojcik", "Warszawa", 35));
        peopleList.add( new Person("Asia", "Miszczuk", "Poznan", 43));
        peopleList.add( new Person("Ewelina", "Rogalska", "Wroclaw", 19));
        peopleList.add(new Person("Daniel", "Marciniak", null, 21));
        peopleList.add(null);

        Person getOldestWoman = PersonService.getTheOldestWomen(peopleList);
        System.out.println("\nNajstarsza kobieta: " + getOldestWoman);

        double getAvgAge = PersonService.getAvgPersonsAge(peopleList);
        System.out.println("Średni wiek: " + getAvgAge);

        double getAvgMenAge = PersonService.getAvgMenAge(peopleList);
        System.out.println("Średni wiek mężczyzn: " + getAvgMenAge);

        double getAvgWomenAge = PersonService.getAvgWomanAge(peopleList);
        System.out.println("Średni wiek kobiet: " + getAvgWomenAge);

        double getAvgAgeForSpecificGenderMan = PersonService.getAvgAgeForSpecificGender(peopleList, x -> !x.isWoman());
        System.out.println("Średni wiek mężczyzn z podanym parametrem: " + getAvgAgeForSpecificGenderMan);

        double getAvgAgeForSpecificGenderWoman = PersonService.getAvgAgeForSpecificGender(peopleList, Person::isWoman);
        System.out.println("Średni wiek kobiet z podanym parametrem: " + getAvgAgeForSpecificGenderWoman);

        String getCityWithMostPeople = PersonService.findCityWithMostPeople(peopleList);
        System.out.println("Miasto z największą liczbą ludzi: " + getCityWithMostPeople);

        Set<String> getUniqueCities = PersonService.findUniqueCities(peopleList);
        System.out.println("Wszystkie różne miasta z listy: " + getUniqueCities);
    }
}
