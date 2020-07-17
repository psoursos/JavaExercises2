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
public class Square extends Shape {

    double side;

    public Square(String color, Size size,double side) {
        super(color, size);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    public double getPerimeter() {
        return (4 * side);
    }

    @Override
    public void printShape() {
        System.out.println("Square");
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}
