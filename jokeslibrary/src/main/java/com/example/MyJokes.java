package com.example;

import java.util.HashMap;

public class MyJokes {

    HashMap<String, String> jokeMap = new HashMap<>(2);

    private String jokeKey = "joke";

    private String answerKey = "answer";

    private String defaultJoke = "Whats the object-oriented way to become wealthy?";

    private String defaultJokeAnswer = "Inheritance";

    private String joke1 = "How many programmers does it take to change a light bulb?";

    private String answer1 = "None, that's a hardware problem";

    private String joke2 = "A physicist, an engineer and a programmer were in a car driving over a steep " +
            "alpine pass when the brakes failed. The car was getting faster and faster, they were " +
            "struggling to get round the corners and once or twice only the feeble crash barrier " +
            "saved them from crashing down the side of the mountain. They were sure they were all " +
            "going to die, when suddenly they spotted an escape lane. They pulled into the escape " +
            "lane, and came safely to a halt. What does each one say?";

    private String answer2 = "The physicist said \"We need to model the friction in the brake pads " +
            "and the resultant temperature rise, see if we can work out why they failed\".\n" +
            "\n" +
            "The engineer said \"I think I've got a few spanners in the back. I'll take a look and " +
            "see if I can work out what's wrong\".\n" +
            "\n" +
            "The programmer said \"Why don't we get going again and see if it's reproducible?\"";

    private MyJokes(int val) {
        switch(val) {
            case 0:
                jokeMap.put(jokeKey, joke1);
                jokeMap.put(answerKey, answer1);
                break;
            case 1:
                jokeMap.put(jokeKey, joke2);
                jokeMap.put(answerKey, answer2);
                break;
            default:
                jokeMap.put(jokeKey, defaultJoke);
                jokeMap.put(answerKey, defaultJokeAnswer);
                break;
        }
    }

    public static MyJokes getInstance(int val) {
        return new MyJokes(val);
    }

    public String getAJoke() {
        return jokeMap.get(jokeKey);
    }

    public String getJokeAnswer() {
        return jokeMap.get(answerKey);
    }

}
