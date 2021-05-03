/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.Exampe1Prototype;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Circle c=(Circle)ShapeStore.createClone("Circle");
        c.draw();
        Triangle t=(Triangle)ShapeStore.createClone("Triangle");
        t.draw();
        System.out.println(t);
        Triangle t1=(Triangle)ShapeStore.createClone("Triangle");
         
        t1.draw();
        System.out.println(t1);
        Triangle t2=(Triangle)ShapeStore.createClone("Triangle");
        t2.draw();
        System.out.println(t2);
    }
}
