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
public class User extends AbstractUser{

    public User(String userId, Mediator chatRoom) {
        super (userId,chatRoom);
    }
    
     
    @Override
    void send(String userId, String message) {
        System.out.println(this.getUserId()+" send  a"+message);
        this.getChatRoom().sendMessage(userId, message);
    }
  
    
    @Override
    void receive(String message) {
        System.out.println(getUserId()+" received a "+message+" message");
    }
    
}
