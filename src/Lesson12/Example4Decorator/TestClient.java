/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.Example4Decorator;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        Shape circle=new Circle();
      //  circle.draw();
        
        Shape borderedCircle=new BorderedShapeDecorator(new Circle());
        borderedCircle.draw();
        
    }
}
