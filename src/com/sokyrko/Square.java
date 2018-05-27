package com.sokyrko;

/**
 * This class contains formulas for counting area and perimeter of square.
 */

public class Square extends Figure {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    /**
     * Extended methods from the main Figure class with proper formulas for square.
     */

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
