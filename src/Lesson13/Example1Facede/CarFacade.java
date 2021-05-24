/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example1Facede;

/**
 *
 * @author alinizam
 */
public class CarFacade {
    void move(){
        FuelSubsystem f=new FuelSubsystem();
        BrakeSubsystem b=new BrakeSubsystem();
        HandBreakSubsystem h=new HandBreakSubsystem();
        if (h.getHandBrakSituation()){
            f.fuelControl();
            b.brakeControl();
        } 
    }
}
