/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Example2Visitor;

/**
 *
 * @author alinizam
 */
public class ShapeRectangleVisitor implements ShapeVisitor {

    @Override
    public void getArea(Shape shape) {
        if (shape instanceof Rectangle) {
            int a = ((Rectangle) shape).a;
            int b = ((Rectangle) shape).b;

            System.out.println("The area of rectangle is " + a * b);
        }
    }
}
