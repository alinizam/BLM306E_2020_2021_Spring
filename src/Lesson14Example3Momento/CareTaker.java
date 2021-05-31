/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example3Momento;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class CareTaker {
    ArrayList<Momento> states=new ArrayList();
    void add(Momento m){
        states.add(m);    
    }
    Momento get(int i){
        return states.get(i);    
    } 
}
