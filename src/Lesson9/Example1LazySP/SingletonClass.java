/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Example1LazySP;

import Lesson9.Example1EagerSP.*;

/**
 *
 * @author alinizam
 */
public class SingletonClass {

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    private SingletonClass() {
    }

}
