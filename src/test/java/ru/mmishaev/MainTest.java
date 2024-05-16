package ru.mmishaev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void MainTest() {
        List<Integer> expected = Arrays.asList(2, 4, 8, 16, 32);

    }
}