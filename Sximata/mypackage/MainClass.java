/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.List;
import static mypackage.Size.SMALL;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

/**
 *
 * @author petros
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Triangle t1 = new Triangle("red", SMALL, 2, 2, 2, 2);
        Square s1 = new Square("red", SMALL, 2);
        Circle c1 = new Circle("red", SMALL, 2);

        List<Shape> myShapes = new ArrayList();
        myShapes.add(t1);
        myShapes.add(s1);
        myShapes.add(c1);

        printAll(myShapes);
        printRes(myShapes);

        Square s2 = new Square("blue", SMALL, 3);
        Square s3 = new Square("red", SMALL, 5);

        myShapes.add(s2);

        myShapes.add(s3);

        printAll(myShapes);
        printRes(myShapes);

    }

    public static void printRes(List<Shape> myShapes) {

        double maxA = 0.0;
        double maxP = 0.0;
        for (Shape sh : myShapes) {

            //sh.printShape();

            if (sh.getArea() > maxA) {
                maxA = sh.getArea();
            }

            if (sh.getPerimeter() > maxP) {
                maxP = sh.getPerimeter();
            }
        }

        for (Shape sh : myShapes) {

            //sh.printShape();
            if (sh.getArea() == maxA) {
                
                System.out.println("Gratest Area");
                System.out.println(sh.toString());
            }

            if (sh.getPerimeter() == maxP) {
                System.out.print("Has the gratest Perimeter");
                System.out.println(sh.toString());
            }
        }
    }

    public static void printAll(List<Shape> myShapes) {
        
        System.out.println("****************************************************");

        for (Shape sh : myShapes) {

            sh.printShape();
            
        
        }
        System.out.println("****************************************************");
    }

}
