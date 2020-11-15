package edu.epam.task.one.service;

import edu.epam.task.one.constant.Color;
import edu.epam.task.one.entity.Ball;
import edu.epam.task.one.entity.Basket;
import edu.epam.task.one.util.BallsReader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
    public static void initBasketService() {
        basketService = new BasketService();
    }

    @BeforeClass
    public static void initBallsReader() {
        ballsReader = new BallsReader();
    }

    @BeforeClass
    public static void initBalls() throws IOException{
        initBallsReader();
        balls = ballsReader.readBallsInfoFromFile(FILE_PATH);
    }

    @BeforeClass
    public static void initBasket() {
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
    public static void clearBalls() {
        balls = null;
    }

    @AfterClass
    public static void clearBasket() {
        basket = null;
    }

    @AfterClass
    public static void clearBallsReader() {
        ballsReader = null;
    }

    @AfterClass
    public static void clearBasketService() {
        basketService = null;
    }
}
