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
public class MP3 implements IOldMediaPlayer{

    @Override
    public void playOld() {
        System.out.println("Playing MP3");
    }
    
}
