package com.jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IslandsCounterTest {

    private IslandsCounter islandsCounter;

    @Before
    public void setUp() {
        islandsCounter = new IslandsCounter();
    }

    @Test
    public void puttingIntoCountIslandsMethod2dArray_shouldReturn5() {

        int map[][] = new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        int expected = 5;
        int actual = islandsCounter.getNumberOfIslands(map);
        assertEquals(expected, actual);
    }

    @Test
    public void puttingIntoCountIslandsMethod2dArray_shouldReturn3() {
        int map[][] = new int[][]{
                {1, 1, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1}
        };

        int expected = 3;
        int actual = islandsCounter.getNumberOfIslands(map);
        assertEquals(expected, actual);
    }

    @Test
    public void puttingIntoCountIslandsMethod2dArray_shouldReturn1() {

        int map[][] = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1},
                {1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };

        int expected = 1;
        int actual = islandsCounter.getNumberOfIslands(map);
        assertEquals(expected, actual);
    }
}