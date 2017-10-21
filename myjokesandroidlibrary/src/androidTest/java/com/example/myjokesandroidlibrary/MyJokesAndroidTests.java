package com.example.myjokesandroidlibrary;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.example.MyJokes;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MyJokesAndroidTests {

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.myjokesandroidlibrary.test", appContext.getPackageName());
    }

    @Test
    public void assertNotNullJokes_TestOne() {
        int val = 0;
        MyJokes jokes = MyJokes.getInstance(val);
        assertNotNull(jokes.getAJoke());
        assertNotNull(jokes.getJokeAnswer());
    }

    @Test
    public void assertNotNullJokes_TestTwo() {
        int val = 1;
        MyJokes jokes = MyJokes.getInstance(val);
        assertNotNull(jokes.getAJoke());
        assertNotNull(jokes.getJokeAnswer());
    }

    @Test
    public void assertNotNullJokes_TestThree() {
        int val = 2;
        MyJokes jokes = MyJokes.getInstance(val);
        assertNotNull(jokes.getAJoke());
        assertNotNull(jokes.getJokeAnswer());
    }

    @Test
    public void assertNotEmptyString_TestOne() {
        int val = 0;
        MyJokes jokes = MyJokes.getInstance(val);
        assertFalse(TextUtils.isEmpty(jokes.getAJoke()));
        assertFalse(TextUtils.isEmpty(jokes.getJokeAnswer()));
    }

    @Test
    public void assertNotEmptyString_TestTwo() {
        int val = 1;
        MyJokes jokes = MyJokes.getInstance(val);
        assertFalse(TextUtils.isEmpty(jokes.getAJoke()));
        assertFalse(TextUtils.isEmpty(jokes.getJokeAnswer()));
    }

    @Test
    public void assertNotEmptyString_TestThree() {
        int val = 2;
        MyJokes jokes = MyJokes.getInstance(val);
        assertFalse(TextUtils.isEmpty(jokes.getAJoke()));
        assertFalse(TextUtils.isEmpty(jokes.getJokeAnswer()));
    }
}
