package com.example.myjokesandroidlibrary;

import com.example.MyJokes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MyJokesUnitTest {

    @Test
    public void checkNotNull() throws Exception {
        int val = 0;

        MyJokes jokes = MyJokes.getInstance(val);

        assertNotNull(jokes);
    }

    @Test
    public void checkNotNull_JokeOne() throws Exception {
        int val = 0;

        MyJokes jokes = MyJokes.getInstance(val);

        assertNotNull(jokes.getAJoke());
        assertNotEquals(jokes.getAJoke(), "");

        assertNotNull(jokes.getJokeAnswer());
        assertNotEquals(jokes.getJokeAnswer(), "");
    }

    @Test
    public void checkNotNull_JokeTwo() throws Exception {
        int val = 1;

        MyJokes jokes = MyJokes.getInstance(val);

        assertNotNull(jokes.getAJoke());
        assertNotEquals(jokes.getAJoke(), "");

        assertNotNull(jokes.getJokeAnswer());
        assertNotEquals(jokes.getJokeAnswer(), "");
    }

    @Test
    public void checkNotNull_JokeThree() throws Exception {
        int val = 2;

        MyJokes jokes = MyJokes.getInstance(val);

        assertNotNull(jokes.getAJoke());
        assertNotEquals(jokes.getAJoke(), "");

        assertNotNull(jokes.getJokeAnswer());
        assertNotEquals(jokes.getJokeAnswer(), "");
    }
}