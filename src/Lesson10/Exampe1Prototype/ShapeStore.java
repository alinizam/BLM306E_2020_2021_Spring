/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.Exampe1Prototype;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author alinizam
 */
public class ShapeStore {
    public static Map<String,ShapePrototype> shapes=new HashMap<String,ShapePrototype>();
    static{
        shapes.put("Circle", new Circle());
        shapes.put("Triangle", new Triangle());
    }
    /*static void loadStore(){
        shapes.put("Circle", new Circle());
        shapes.put("Triangle", new Triangle());
    }*/
    static ShapePrototype createClone(String shapeType){
        return (ShapePrototype)shapes.get(shapeType).clone();
    }
}
