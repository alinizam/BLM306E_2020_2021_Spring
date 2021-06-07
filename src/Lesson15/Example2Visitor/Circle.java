/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Example2Visitor;

/**
 *
 * @author alinizam
 */
public class Circle implements Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }
    
    public void visit(ShapeVisitor visitor) {
        visitor.getArea(this);
    }
   
}
