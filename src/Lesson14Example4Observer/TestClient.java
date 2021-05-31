/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example4Observer;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        Subject s=new Subject();
        s.addObserver(new NumericalObserver());
        s.addObserver(new StringObserver());
        s.setNumber(25);
        s.setValue("Ahmet");
    }
}
