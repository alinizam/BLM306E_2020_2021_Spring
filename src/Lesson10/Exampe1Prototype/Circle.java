/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.Exampe1Prototype;

/**
 *
 * @author alinizam
 */
public class Circle extends ShapePrototype{

    public Circle() {
        System.out.println("I circle is created");
    }

    
    @Override
    void draw() {
        System.out.println("I am a circle");
    }  
}
