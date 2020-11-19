package edu.epam.task.one.service;

import edu.epam.task.one.constant.Color;
import edu.epam.task.one.entity.Ball;
import edu.epam.task.one.entity.Basket;
import edu.epam.task.one.util.BallsReader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class BasketServiceTest {

    public static final String FILE_PATH = "inputFiles/input.txt";
    private static BallsReader ballsReader;
    private static List<Ball> balls;
    private static Basket basket;
    private static BasketService basketService;
    
    @BeforeClass
    public static void initialize() throws IOException{
        basketService = new BasketService();
        ballsReader = new BallsReader();
        balls = ballsReader.readBallsInfoFromFile(FILE_PATH);
        basket = new Basket(balls);
    }

    @Test
    public void equalsTestWeight() {
        double actualWeightResult = basketService.getWeightOfBalls(basket);
        double expectedWeightResult = 29.24;
        assertEquals(actualWeightResult, expectedWeightResult);
    }

    @Test
    public void equalsTestColors() {
        int actualColorResult = basketService.getCountOfSomeColorBalls(basket, Color.BLUE);
        int expectedColorResult = 4;
        assertEquals(actualColorResult, expectedColorResult);
    }

    @AfterClass
    public static void clear() {
        balls = null;
        basket = null;
        ballsReader = null;
        basketService = null;
    }
}
