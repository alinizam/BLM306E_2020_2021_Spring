/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.Example2Builder;

/**
 *
 * @author alinizam
 */
//Product Class
public class Employee {

    String firstName, lastName, department;
    int salary;

    public Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.department = builder.department;
        this.salary = builder.salary;
    }
   /* static Builder setBuilder(){
        return new Builder();
    }*/
    static class Builder {
        static Builder setBuilder(){
             return new Builder();
        }
        String firstName, lastName, department;
        int salary;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder department(String department) {
            this.department = department;
            return this;
        }
        
        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }
        
        Employee build(){
            Employee e=new Employee(this);
            System.out.println(e);
            return e;
        }

    }
}
