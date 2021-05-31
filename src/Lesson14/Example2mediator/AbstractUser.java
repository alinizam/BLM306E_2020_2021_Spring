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
public abstract class AbstractUser {
 
    private String userId;
    private Mediator chatRoom;
    
    abstract void send(String userId, String message);
    abstract void receive( String message);

    public String getUserId() {
        return userId;
    }

    public AbstractUser(String userId, Mediator chatRoom) {
        this.userId = userId;
        this.chatRoom = chatRoom;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setChatRoom(Mediator chatRoom) {
        this.chatRoom = chatRoom;
    }

    public Mediator getChatRoom() {
        return chatRoom;
    }
    
    
    
}
