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
public class Example4 {
    class Circle{
        int p,r;
        int area(){
            return p*r*r;
        }
    }
    class Square{
        int r;
        int area(){
            return r*r;
        }
    }
    
    class Screen{
        ArrayList<Object> objects=new ArrayList();
        int calculateArea(){
            int totalArea=0;
            for (Object object : objects) {
                if (object instanceof Circle){
                    totalArea+=((Circle)object).area();
                }else if (object instanceof Square){
                    totalArea+=((Square)object).area();
                } 
            }
            return totalArea;
        }
    
    }
    
}
