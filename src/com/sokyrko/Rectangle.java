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
     * Extended method from the main Figure class with proper formula for counting rectangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Extended method from the main Figure class with proper formula for counting rectangle area.
     */
    @Override
    public double getArea() {
        return width * length;
    }
}
