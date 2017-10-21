package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Ila on 10/21/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityAndroidTests {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkShowJoke() {
        onView(withId(R.id.show_joke_button)).perform(click());
        onView(withId(R.id.myjoke_textview)).check(matches(isDisplayed()));
    }


    @Test
    public void checkShowJokeAnswer() {
        onView(withId(R.id.show_joke_button)).perform(click());
        onView(withId(R.id.myjoke_textview)).check(matches(isDisplayed()));
        onView(withId(R.id.tell_me_button)).perform(click());
        onView(withId(R.id.myjoke_answer_textview)).check(matches(isDisplayed()));
    }

}
