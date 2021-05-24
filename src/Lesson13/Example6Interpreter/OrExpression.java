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
public class OrExpression implements Expression{
    private Expression exp1;
    private Expression exp2;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context)||exp2.interpret(context);
    } 
    
}
