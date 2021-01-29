package com.grishin.example3;

import java.util.List;

public class Route {

    private List<Point> points;

    public Route(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }
}
