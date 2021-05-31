/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example3Momento;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        Originator o=new Originator();
        o.state="Ahmet";
        CareTaker c=new CareTaker();
        c.add(o.saveState());
        //do something
        System.out.println(o.getState(c, 0).getState());
    }
}
