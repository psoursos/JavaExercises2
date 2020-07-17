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
public class Triangle extends Shape {

    double height;
    double base;
    double side1;
    double side2;

    public Triangle(String color, Size size,double height, double base, double side1, double side2 ) {
        super(color, size);
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return ((base * height) / 2);
    }

    @Override
    public double getPerimeter() {
        return (base + side1 + side2);
    }

    @Override
    public void printShape() {
        System.out.println("Triangle");
    }

    @Override
    public String toString() {
        return "Triangle{" + "height=" + height + ", base=" + base + ", side1=" + side1 + ", side2=" + side2 + '}';
    }

}
