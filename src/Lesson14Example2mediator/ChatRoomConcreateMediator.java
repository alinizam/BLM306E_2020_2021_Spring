/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example2mediator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alinizam
 */
public class ChatRoomConcreateMediator implements Mediator{
    
    private Map<String,AbstractUser> users=new HashMap();

    @Override
    public void sendMessage(String userId, String message) {
       AbstractUser u=users.get(userId);
       u.receive(message);
    }
             

    @Override
    public void addUser(AbstractUser user) {
        users.put(user.getUserId(), user );
    }
    
}
