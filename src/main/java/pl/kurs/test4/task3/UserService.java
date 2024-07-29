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
}
