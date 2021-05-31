/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.Example3Momento;

/**
 *
 * @author alinizam
 */
public class Originator {
    String state; 
    Momento saveState(){
        return new Momento(state);
    }
    
    Momento getState(CareTaker careTaker,int i){
        return careTaker.get(i);
    }
}
