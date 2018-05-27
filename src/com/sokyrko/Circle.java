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
     * Extended method from the main Figure class with proper formula for counting circle perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    /**
     * Extended method from the main Figure class with proper formula for counting circle area.
     */
    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }
}
