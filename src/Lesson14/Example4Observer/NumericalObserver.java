/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.Example4Observer;

/**
 *
 * @author alinizam
 */
public class NumericalObserver implements IObserver {

    @Override
    public void update(Subject subject) {
        System.out.println(subject.getNumber()+" changed");
    }

}
