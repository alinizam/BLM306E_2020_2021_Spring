/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.Example5;

/**
 *
 * @author alinizam
 */
public class Example5BasicSolution {
        static class Bird{
    }
    static class FlyingBird extends Bird{
        void fly(){
        }
    }
    static class SwimmingBird extends Bird{
        
    }
    static class Duck extends FlyingBird{
    
    }
    static class NonFlyingBird extends Bird{
    }
    static class Penguin extends NonFlyingBird{
        
    }
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        Penguin p=new Penguin();
       // p.fly(); //Problem
     
    
    }
 
}
