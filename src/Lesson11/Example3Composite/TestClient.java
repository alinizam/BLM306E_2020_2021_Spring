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
public class TestClient {
    public static void main(String[] args) {
        EmployeeComposite manager=new EmployeeComposite();
        manager.addEmployee(new Developer("Ahmet","Ak"));
        manager.addEmployee(new Analist("Kemal","Sarı"));
        manager.addEmployee(new Analist("Ayşe","Sarı"));
        manager.listEmployees();
        manager.addEmployee(manager);
        for (IEmployee employee : manager.employees) {
                employee.showName();
            for (IEmployee subEmployees : manager.employees) {
                System.out.print("-->");
                subEmployees.showName();
            }
        }
    }
}
