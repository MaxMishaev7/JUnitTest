package ru.mmishaev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamListTest {
    private StreamList lst;
    @BeforeEach
    void setUp() {
        lst = new StreamList();
    }

    @Test
    public void streamListOfEven() {
        List<Integer> startList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expectedList = Arrays.asList(2, 4, 8, 16, 32);
        List<Integer> resultedList = lst.streamListOfEven(startList);
        assertEquals(expectedList, resultedList);

        List<Integer> startList2 = Arrays.asList(4, -20, 345, 65, 99, -787, 40, 7, 2, 944);
        List<Integer> expectedList2 = Arrays.asList(2, 4, 40, 944);
        List<Integer> resultedList2 = lst.streamListOfEven(startList2);
        assertEquals(expectedList2, resultedList2);
    }
}