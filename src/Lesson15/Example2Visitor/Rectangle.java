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
public class Rectangle implements Shape{
    int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void visit(ShapeVisitor visitor) {
        visitor.getArea(this);
    }
    
}
