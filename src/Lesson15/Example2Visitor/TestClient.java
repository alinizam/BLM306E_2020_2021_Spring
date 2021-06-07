/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Example2Visitor;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        ArrayList<Shape> shapes=new ArrayList<>();
        shapes.add(new Rectangle(3, 5));
        shapes.add(new Circle(3));
        shapes.add(new Circle(5));
        for (Shape shape : shapes) {
            shape.visit(new ShapeRectangleVisitor());
        }
        
    }
}
