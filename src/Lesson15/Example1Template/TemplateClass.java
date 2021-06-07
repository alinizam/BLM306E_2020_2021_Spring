/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Example1Template;

/**
 *
 * @author alinizam
 */
public abstract class TemplateClass {
    final void templateMethod(){
        operation1();
        operation2();
        operation3();
    }

    abstract void operation1();
    abstract void operation2();
    abstract void operation3();
}
