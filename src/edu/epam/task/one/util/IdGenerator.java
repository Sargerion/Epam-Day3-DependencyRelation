package edu.epam.task.one.util;

import java.util.Random;

public class IdGenerator {

    private static final Random RND = new Random();

    public static int generateId() {
        return RND.nextInt(1000000001) + 1147483646;
    }

}
