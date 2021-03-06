package edu.epam.task.one.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Ball> balls;
    
    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public Ball getBall(int index) {
        return balls.get(index);
    }

    public int ballsCount() {
        return balls.size();
    }

}
