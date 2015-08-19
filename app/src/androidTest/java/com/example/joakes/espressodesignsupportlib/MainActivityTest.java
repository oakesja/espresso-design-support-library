package com.example.joakes.espressodesignsupportlib;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest extends ActivityTestRule<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Before
    public void setup(){
        launchActivity(new Intent());
        getActivity();
    }

    @Test
    public void testOne() {
        onView(withText("Test")).check(matches(isDisplayed()));
    }

    @Test
    public void testTwo() {
        onView(withId(R.id.collapsing_tool_bar)).check(matches(withText("Test")));
    }

    @Test
    public void testThree() {
        onView(withId(R.id.collapsing_tool_bar)).check(matches(isDisplayed()));
    }
}
