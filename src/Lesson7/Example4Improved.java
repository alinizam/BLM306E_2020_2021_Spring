/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Example4Improved {
    interface IShape{
        int area();
    }
    class Circle implements IShape{
        int p,r;
        public int area(){
            return p*r*r;
        }
    }
    class Square implements IShape{
        int r;
        public int area(){
            return r*r;
        }
    }
    
    class Screen{
        ArrayList<IShape> objects=new ArrayList();
        int calculateArea(){
            int totalArea=0;
            for (IShape object : objects) {
                    totalArea+=((Circle)object).area();
            }
            return totalArea;
        }    
    }
}
