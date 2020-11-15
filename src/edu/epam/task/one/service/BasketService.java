package edu.epam.task.one.service;

import edu.epam.task.one.constant.Color;
import edu.epam.task.one.entity.Basket;

public class BasketService {

    public double getWeightOfBalls(Basket basket) {
        double resultWeight = 0;
        for (int i = 0; i < basket.ballsCount(); i++) {
            resultWeight += basket.getBall(i).getWeight();
        }
        return (double)Math.round(resultWeight * 100)/ 100;
    }

    public int getCountOfSomeColorBalls(Basket basket, Color color) {
        int count = 0;
        for (int i = 0; i < basket.ballsCount(); i++) {
            if(basket.getBall(i).getColor() == color) {
                count++;
            }
        }
        return count;
    }
}
