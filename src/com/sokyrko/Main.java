package com.sokyrko;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        /**
         * This object contains radius value of the circle and prints out area and perimeter of it.
         */

        Circle circle = new Circle(8);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        /**
         * This object contains value of width and length of the sides of rectangle and prints its area and perimeter.
         */

        Rectangle rectangle = new Rectangle(8, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        /**
         * This object contains square side value and prints its area and perimeter.
         */

        Square square = new Square(4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }

}