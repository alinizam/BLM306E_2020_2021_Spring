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
public class PositiveProcessor extends Processor{
    
    public PositiveProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(int inputNumber) {
        if (inputNumber>0)
            System.out.println("Positeive Handler work");
        else{
            super.process(inputNumber); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
