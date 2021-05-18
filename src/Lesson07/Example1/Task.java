package Lesson07.Example1;
public class Task implements ITask{
     void makeSomething(){
         System.out.println("Starting Making Something");
     }
    @Override
    public void doSomething() {
        makeSomething();
    }
}
