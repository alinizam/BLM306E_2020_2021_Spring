/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example5Command;

import javafx.scene.effect.Light;

/**
 *
 * @author alinizam
 */
public class ClientTest {
    public static void main(String[] args) {
        LightReceiver ligth=new LightReceiver();
        Command c=new LigthOnCommand(ligth);
        c.execute();
    }
}
