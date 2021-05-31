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
public class Context {
    Algorithm operationStrategy;

    public Context(Algorithm operationStrategy) {
        this.operationStrategy = operationStrategy;
    }
    int executeStrategy(int a,int b){
        return operationStrategy.doOperation(a, b);
    }
}
