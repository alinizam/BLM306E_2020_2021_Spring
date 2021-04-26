/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Example3;

import Lesson9.Example2.*;

/**
 *
 * @author alinizam
 */
public class ShapeFactory implements AbstractFactory{
    enum shapeTypeEnum implements IProductEnum{
        RECTANGLE,
        SQUARE
    } 
    public Product create(IProductEnum shapeType) {
        Shape temp = null;
        if (shapeType==((shapeTypeEnum)shapeType).RECTANGLE) {
            temp = new Rectangle();
        } else if (shapeType==((shapeTypeEnum)shapeType).SQUARE) {
            temp = new Square();
       }
        return temp;
    }

    public Shape createShapeWithStringParameter(String shapeType) {
        Shape temp = null;
        if (shapeType.equals("RECTANGLE")) {
            temp = new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            temp = new Square();
        }
        return temp;
    }
}
