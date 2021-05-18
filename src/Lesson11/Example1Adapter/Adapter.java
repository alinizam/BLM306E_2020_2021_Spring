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
public class Adapter implements  INewMediaPlayerAdapter {
    IOldMediaPlayer oldFormatMedia;

    public Adapter(IOldMediaPlayer oldFormatObject) {
        this.oldFormatMedia = oldFormatObject;
    }
    
    @Override
    public void playNew() {
        oldFormatMedia.playOld();
    }
    
}
