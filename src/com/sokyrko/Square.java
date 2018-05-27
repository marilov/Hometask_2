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
     * Extended method from the main Figure class with proper formula for counting square perimeter.
     */
    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    /**
     * Extended method from the main Figure class with proper formula for counting square area.
     */
    @Override
    public double getArea() {
        return length * length;
    }
}
