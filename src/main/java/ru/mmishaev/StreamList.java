package ru.mmishaev;

import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    public List<Integer> streamListOfEven(List<Integer> numList) {
        List<Integer> streamNumList = numList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Stream API");
        System.out.println(streamNumList);
        return streamNumList;
    }
}
