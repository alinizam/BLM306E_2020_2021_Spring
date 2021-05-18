/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.Example1Adapter;

/**
 *
 * @author alinizam
 */
public class MP4 implements INewMediaPlayerAdapter{
    
    @Override
    public void playNew() {
        System.out.println("Playing MP4");
    }
    
}
