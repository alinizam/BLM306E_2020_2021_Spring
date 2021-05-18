/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.Example2Bridge;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        Shape redCircle=new Circle(new RedCircle());
        redCircle.draw();
        
        Shape blueCircle=new Circle(new BlueCircle());
        blueCircle.draw();
    }
}
