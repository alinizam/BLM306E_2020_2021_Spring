/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson09.Example3;

import Lesson09.Example2.Rectangle;
import Lesson09.Example2.Shape;
import Lesson09.Example2.Square;

/**
 *
 * @author alinizam
 */
public class ComponentFactory implements AbstractFactory{
 
    enum compType implements IProductEnum{
        BUTTON,
        TEXT_ITEM
    }
    public Product create(IProductEnum componentType) {
        Component temp = null;
        if (componentType==((compType)componentType).BUTTON) {
            temp = new Button();
        } else if (componentType==((compType)componentType).TEXT_ITEM) {
            temp = new TextItem();
       }
        return temp;
    }

    

     
}
