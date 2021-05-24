/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example6Interpreter;

/**
 *
 * @author alinizam
 */
public class TestClient {
    static Expression combinedExpression(){
        Expression terminal1=new TerminalExpression("Ahmet");
        Expression terminal2=new TerminalExpression("Kemal");
        return new OrExpression(terminal1, terminal2);
    }
    public static void main(String[] args) {
     
        System.out.println(combinedExpression().interpret("Mehmet"));
    }
}
