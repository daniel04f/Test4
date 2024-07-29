package pl.kurs.test4.task3;

import java.util.Optional;
import java.util.Scanner;

public class UserService {
    public static int askForName(Scanner scanner) {
        System.out.print("Podaj swoje imię: ");
        String name = scanner.nextLine();
        return getNameLength(name);
    }

    private static int getNameLength(String name) {
        return Optional.ofNullable(name)
                .filter(x -> !x.isEmpty())
                .map(String::length)
                .orElse(0);
    }

    public static String askForPesel(Scanner scanner) {
        System.out.print("Podaj swój PESEL: ");
        return scanner.nextLine();
    }

    public static String getBirthDateFromPesel(String pesel) throws InvalidPeselException {
        return Optional.ofNullable(pesel)
                .filter(x -> !x.isEmpty())
                .filter(x -> x.length() == 11)
                .filter(x -> x.chars().allMatch(Character::isDigit))
                .map(UserService::extractBirthDateFromPesel)
                .orElseThrow(() -> new InvalidPeselException("Niepoprawny PESEL"));
    }

    private static String extractBirthDateFromPesel(String pesel) {
        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));
        if (month > 20) {
            year += 2000;
            month -= 20;
        } else {
            year += 1900;
        }
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
