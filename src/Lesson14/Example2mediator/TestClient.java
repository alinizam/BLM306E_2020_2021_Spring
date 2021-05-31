/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.Example2mediator;

/**
 *
 * @author alinizam
 */
public class TestClient {
    public static void main(String[] args) {
        Mediator chatRoom=new ChatRoomConcreateMediator();
        AbstractUser u1=new User("Ahmet",chatRoom);
        AbstractUser u2=new User("Mehmet",chatRoom);
        AbstractUser u3=new User("Kemal",chatRoom);
        
        chatRoom.addUser(u1);
        chatRoom.addUser(u2);
        chatRoom.addUser(u3);
        
        u1.send("Mehmet","Hello");
        
        
        
        
    }
}
