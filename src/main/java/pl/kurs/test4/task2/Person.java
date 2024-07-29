package pl.kurs.test4.task2;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private int age;

    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public boolean isWoman() {
        return firstName.endsWith("a");
    }
}
