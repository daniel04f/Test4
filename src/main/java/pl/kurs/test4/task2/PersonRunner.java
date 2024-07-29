package pl.kurs.test4.task2;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Anna", "Kowalska", "Warszawa", 25));
        peopleList.add(new Person("Jan", "Nowak", "Krakow", 57));
        peopleList.add(new Person("Katarzyna", "Wisniewska", "Gdansk", 33));
        peopleList.add(new Person("Tomasz", "Wojcik", "Warszawa", 35));
        peopleList.add( new Person("Asia", "Miszczuk", "Poznan", 43));
        peopleList.add( new Person("Ewelina", "Rogalska", "Wroclaw", 19));
        peopleList.add(new Person("Daniel", "Marciniak", null, 21));
        peopleList.add(null);
    }
}
