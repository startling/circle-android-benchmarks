package com.circleci.android.example;

import android.test.ActivityInstrumentationTestCase2;
import com.circleci.android.example.MainActivity;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 *
 */
public class EspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public EspressoTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testHelloWorld () {
        onView(withId(R.id.hello_world))
                .check(matches(withText("Hello")));
    }
}
