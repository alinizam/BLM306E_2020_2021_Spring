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
public class ShapeCircleVisitor implements ShapeVisitor {

    @Override
    public void getArea(Shape shape) {
        if (shape instanceof Circle) {
            int r = ((Circle) shape).r;
            int PI = 3;
            System.out.println("The area of circle is " + PI * r * r);
        }
    }

}
