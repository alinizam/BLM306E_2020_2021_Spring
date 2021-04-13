package Lesson7;

public class Example5 {
    static class Bird{
        void fly(){
        }
    }
    static class Duck extends Bird{
    
    }
    static class Penguin extends Bird{
    
    }
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        Penguin p=new Penguin();
        p.fly(); //Problem
    }
 
}
