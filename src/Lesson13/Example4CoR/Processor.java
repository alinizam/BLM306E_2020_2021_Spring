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
public abstract class Processor {
    private Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(int InputNumber){
        nextProcessor.process(InputNumber);
    }
}
