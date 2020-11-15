package edu.epam.task.one.util;

import edu.epam.task.one.constant.Color;
import edu.epam.task.one.entity.Ball;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BallsReader {

    public List<Ball> readBallsInfoFromFile(String fileName) throws IOException{
        File inputFile = new File(fileName);
        if(!inputFile.exists()) {
            throw new IOException("InputFile doesn't exist");
        }
        List<Ball> balls = new ArrayList<>();
        Ball ball = new Ball();
        double weight;
        Color color;
        String line;
        Scanner scanner = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while ((line = reader.readLine()) != null) {
                scanner = new Scanner(line).useDelimiter(" ");
                while (scanner.hasNext()) {
                    weight = scanner.nextDouble();
                    color = Color.valueOf(scanner.next());
                    ball = new Ball(weight, color);
                }
                balls.add(ball);
            }
        }
        return balls;
    }
}
