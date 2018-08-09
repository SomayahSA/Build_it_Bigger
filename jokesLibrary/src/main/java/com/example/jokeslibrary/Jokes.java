package com.example.jokeslibrary;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {


    ArrayList<String> jokes;
    Random random;

    public Jokes() {
        jokes = new ArrayList<>();
        jokes.add("A bank is a place that will lend you money, if you can prove that you don’t need it.\n");
        jokes.add("What is faster Hot or cold? Hot, because you can catch a cold.\n");
        jokes.add("If you listen to a UNIX shell, can you hear the C?");
        jokes.add("Why do Java programmers have to wear glasses?\n" +
                "Because they don’t C#.");
        random = new Random();


    }

    public String tellAJoke() {
        int index = random.nextInt(jokes.size());

        return jokes.get(index);


    }
}