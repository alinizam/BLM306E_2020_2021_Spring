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
public class Rectangle implements Shape,Product{

    @Override
    public String toString() {
        return "I am a rectange";
    }

    
    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void erase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
