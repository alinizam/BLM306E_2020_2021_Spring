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
public class ClientTest {
    public static void main(String[] args) {
        Context c=new Context();
        State s=new StartState();
        s.doAction(c);
        System.out.println(c.getState());
        s=new StopState();
        s.doAction(c);
        System.out.println(c.getState());
    }
}
