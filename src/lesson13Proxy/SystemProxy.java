/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13Proxy;

/**
 *
 * @author alinizam
 */
public class SystemProxy implements ISystem{

    @Override
    public void doSomething() {
        System.out.println("Securiy check");
        RealSystem rs=new RealSystem();
        rs.doSomething();
        System.out.println("Add access log");
    }
    
}
