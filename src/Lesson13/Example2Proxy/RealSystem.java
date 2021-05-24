/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example2Proxy;

/**
 *
 * @author alinizam
 */
class RealSystem implements ISystem{

    @Override
    public void doSomething() {
        System.out.println("System working");
    }
    
}
