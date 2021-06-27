package com.kzish.arrangement;

import org.junit.jupiter.api.*;

import java.util.Arrays;

public class SimpleRearrangeTest {
    private SimpleRearrange simpleRearrange;

    @BeforeEach
    public void setUp() throws Exception {
        simpleRearrange = new SimpleRearrange();
    }

    @Test
    @DisplayName("Case 1")
    public void testSimpleRearrange1() {
        int[] inputArray = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] expectedArray = {-1, 1, 2, 3, 4, -1, 6, -1, -1, 9};
        Assertions.assertArrayEquals(expectedArray, simpleRearrange.simpleRearrange(inputArray));
    }

    @Test
    @DisplayName("Case 2")
    public void testSimpleRearrange2() {
        int[] inputArray = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        Assertions.assertTrue(Arrays.equals(expectedArray, simpleRearrange.simpleRearrange(inputArray)));
    }
}