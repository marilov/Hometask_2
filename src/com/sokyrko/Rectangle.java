package com.sokyrko;

/**
 * This class contains formulas for counting area and perimeter of rectangle.
 */

public class Rectangle extends Figure {

    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    /**
     * Extended methods from the main Figure class with proper formulas for rectangle.
     */

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
