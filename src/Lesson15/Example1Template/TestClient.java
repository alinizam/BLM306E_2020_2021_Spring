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
public class TestClient {
    public static void main(String[] args) {
        TemplateClass temp=new ConcreateImp1();
        temp.templateMethod();
        temp=new ConcreateImp2();
        temp.templateMethod();
    }
}
