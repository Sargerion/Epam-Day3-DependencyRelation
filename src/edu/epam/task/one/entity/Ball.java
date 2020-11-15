package edu.epam.task.one.entity;

import edu.epam.task.one.constant.Color;
import edu.epam.task.one.util.IdGenerator;

public class Ball {
    private int id;
    private double weight;
    private Color color;

    public Ball() {

    }

    public Ball(double weight, Color color) {
        this.id = IdGenerator.generateId();
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null) {
            return false;
        }
        if (!(o instanceof Ball)) {
            return false;
        }
        Ball ball = (Ball) o;
        return (ball.weight == weight) && (color == ball.color);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(weight);
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ball{").append("id=").append(id).append(", weight=").append(weight).append(", color=").append(color).append("}");
        return sb.toString();
    }
}
