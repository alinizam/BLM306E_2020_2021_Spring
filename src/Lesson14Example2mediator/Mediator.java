/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example2mediator;

/**
 *
 * @author alinizam
 */
public interface Mediator {
    void sendMessage(String userId,  String message);
    void addUser(AbstractUser user);
    
}
