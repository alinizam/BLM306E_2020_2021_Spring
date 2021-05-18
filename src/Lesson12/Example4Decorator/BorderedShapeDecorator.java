/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.Example4Decorator;

/**
 *
 * @author alinizam
 */
public class BorderedShapeDecorator extends ShapeDecorator{
    
    public BorderedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw(); //To change body of generated methods, choose Tools | Templates.
        addBorder();
    }
    void addBorder(){
        System.out.println("Border is added");
    }
    
}
