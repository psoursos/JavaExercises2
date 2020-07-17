/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import mypackage.Size;

/**
 *
 * @author petros
 */
public class Circle extends Shape {

    private double radius;
    private double pi = 3.14;

    public Circle(String color, Size size,double radius) {
        super(color, size);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (pi * radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * pi * radius);
    }

    @Override
    public void printShape() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", pi=" + pi + '}';
    }
    

}
