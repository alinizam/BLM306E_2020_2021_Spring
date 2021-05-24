/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example3FlyWeight;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        ShapeFactory.getCircle("Blue");
        ShapeFactory.getCircle("Blue");
        ShapeFactory.getCircle("Yellow");
        ShapeFactory.getCircle("Blue");
        System.out.println(ShapeFactory.getSize());
         
    }
}
