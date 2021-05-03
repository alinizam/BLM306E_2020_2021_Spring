/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.Exampe1Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public abstract class ShapePrototype implements Cloneable{
     int x,y;

    @Override
    protected Object clone() {
         Object clone=null;
         try {
             clone = super.clone(); //To change body of generated methods, choose Tools | Templates.
         } catch (CloneNotSupportedException ex) {
             Logger.getLogger(ShapePrototype.class.getName()).log(Level.SEVERE, null, ex);
         }
         return clone; 
    }
    
    abstract void draw();
}
