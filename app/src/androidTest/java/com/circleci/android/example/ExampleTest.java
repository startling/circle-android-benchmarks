package com.circleci.android.example;

import android.test.InstrumentationTestCase;

/**
 * This is a failing test.
 */
public class ExampleTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 5;
        final int actual = 3;
        assertEquals(expected, actual);
    }
}
