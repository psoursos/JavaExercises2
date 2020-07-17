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
public class Shape {

    private String color;
    private Size size;

    public Shape(String color, Size size) {
        this.color = color;
        this.size = size;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public void printShape() {
        System.out.println("");
    }

}
