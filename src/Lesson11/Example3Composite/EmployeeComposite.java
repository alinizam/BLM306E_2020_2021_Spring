/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.Example3Composite;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class EmployeeComposite implements IEmployee{
    String firstName, lastName;
    ArrayList<IEmployee> employees=new ArrayList();
    @Override
    public void showName() {
        System.out.println("Composite "+firstName + " " +lastName);
    }
    
    void addEmployee(IEmployee e){
        employees.add(e);
    }
    
    void removeEmployee(IEmployee e){
        employees.remove(e);
    }
    
    void  listEmployees(){
        for (IEmployee employee : employees) {
            employee.showName();
        }
    }
}
