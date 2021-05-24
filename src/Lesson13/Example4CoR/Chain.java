/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example4CoR;

/**
 *
 * @author alinizam
 */
public class Chain {
    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain=new PositiveProcessor(new NegativeProcessor(null));
    }
    
    void process(int inputNumber){
        chain.process(inputNumber);
    }
    
}
