/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example5Command;

/**
 *
 * @author alinizam
 */
public class LigthOffCommand implements Command{
    private LightReceiver ligth;

    public LigthOffCommand(LightReceiver ligth) {
        this.ligth = ligth;
    }
    
    @Override
    public void execute() {
        ligth.off();
    }    
}
