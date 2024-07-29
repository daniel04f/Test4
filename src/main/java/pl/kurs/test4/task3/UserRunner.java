package pl.kurs.test4.task3;

import java.util.Scanner;

public class UserRunner {
    public static void main(String[] args) throws InvalidPeselException {
        Scanner scanner = new Scanner(System.in);

        int nameLength = UserService.askForName(scanner);
        System.out.println("Długość imienia: " + nameLength);

        String pesel = UserService.askForPesel(scanner);
        String birthDate = UserService.getBirthDateFromPesel(pesel);
        System.out.println("Data urodzenia: " + birthDate);
    }
}
