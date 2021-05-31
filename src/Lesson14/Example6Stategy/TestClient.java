/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.Example6Stategy;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        Context c=new Context(new AddOperation());
        System.out.println(c.executeStrategy(3, 2));
        c.operationStrategy=new MinusOperation();
        System.out.println(c.executeStrategy(3, 2));
    }
}
