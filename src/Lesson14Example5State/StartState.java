/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example5State;

/**
 *
 * @author alinizam
 */
public class StartState implements State{

    @Override
    public void doAction(Context c) {
        System.out.println("the object in start state");
        c.setState(this);
    }
    
}
