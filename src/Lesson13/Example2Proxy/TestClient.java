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
public class TestClient {
    public static void main(String[] args) {
        ISystem proxy=new SystemProxy();
        proxy.doSomething();
    }
}
