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
public class TestClient {
    public static void main(String[] args) {
        INewMediaPlayerAdapter player=new Adapter(new MP3());
        player.playNew();
        
        INewMediaPlayerAdapter player1=new MP4();
        player1.playNew();
        
        INewMediaPlayerAdapter player2=new Adapter(new MP2());
        player2.playNew();
        
        
    }
}
