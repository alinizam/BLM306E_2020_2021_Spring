/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.Example5State;

/**
 *
 * @author alinizam
 */
public class StopState implements State{
    @Override
    public void doAction(Context c) {
        System.out.println("the object in stop state");
        c.setState(this);
    }
    
}