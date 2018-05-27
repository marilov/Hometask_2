package com.sokyrko;

/**
 * This class contains formulas for counting area and perimeter of circle.
 */

public class Circle extends Figure {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Extended methods from the main Figure class with proper formulas for circle .
     */

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }
}
