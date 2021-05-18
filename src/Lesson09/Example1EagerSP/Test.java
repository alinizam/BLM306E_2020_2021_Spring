/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson09.Example1EagerSP;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        SingletonClass s1=SingletonClass.getInstance();
        SingletonClass s2=SingletonClass.getInstance();
        System.out.println(s1==s2);
    }
}
