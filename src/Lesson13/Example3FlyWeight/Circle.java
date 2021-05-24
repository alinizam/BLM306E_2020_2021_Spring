/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.Example3FlyWeight;

/**
 *
 * @author alinizam
 */
public class Circle implements Shape{
    String colorKey;

    public Circle(String colorKey) {
        this.colorKey = colorKey;
    }

    @Override
    public void draw(){
        System.out.println("Draw a "+colorKey+" circle");
    }
    
}
