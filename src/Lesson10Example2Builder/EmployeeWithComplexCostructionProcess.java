/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10Example2Builder;

/**
 *
 * @author alinizam
 */
public class EmployeeWithComplexCostructionProcess {
    String firstName, lastName, department;
    int salary;

    public EmployeeWithComplexCostructionProcess(String firstName, String lastName, String department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
    
    public EmployeeWithComplexCostructionProcess(String firstName, String lastName,  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
    
    public EmployeeWithComplexCostructionProcess(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
}
