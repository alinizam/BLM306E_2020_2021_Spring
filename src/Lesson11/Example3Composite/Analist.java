/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.Example3Composite;

/**
 *
 * @author alinizam
 */
public class Analist  implements IEmployee{
    String firstName, lastName;

    public Analist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
    @Override
    public void showName() {
          System.out.println("Analist " +firstName + " " +lastName);
    }
    
}
