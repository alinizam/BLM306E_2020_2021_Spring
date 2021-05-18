/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson07.Example5;

/**
 *
 * @author alinizam
 */
public class Example5ImprovedWihInterfaces {
    interface Flyeable{ 
        void fly();
    };
    interface Swimmeable{ 
        void swim();
    };
    static class Bird{
    }
   
    static class Duck implements Flyeable,Swimmeable{
        @Override
        public void fly() {
           
        }
        @Override
        public void swim() {
           
        }
    }
    static class Penguin implements Swimmeable{
        @Override
        public void swim() {

        }
    }
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        Penguin p=new Penguin();
        //p.fly(); //Problem
    }

}