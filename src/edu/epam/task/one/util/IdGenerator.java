package edu.epam.task.one.util;

import java.util.Random;

public class IdGenerator {

    private static final Random rnd = new Random();

    public static int generateId() {
        return rnd.nextInt(1000000001) + 1147483646;
    }

}
