package pl.kurs.test4.task4;

import java.util.*;
import java.util.stream.Collectors;

public class Service {
    public static List<Integer> getListOfFiveBiggestElementsFromIntegersList(List<Integer> integersList) {
        List<Integer> resultList = Optional.ofNullable(integersList)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());

        return resultList.size() == 5 ? resultList : Collections.emptyList();
    }
}
