package pl.kurs.test4.task4;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 8, 3, 17, -2, -1);

        List<Integer> resultList = Service.getListOfFiveBiggestElementsFromIntegersList(numbers);
        System.out.println("resultList = " + resultList);
    }
}
