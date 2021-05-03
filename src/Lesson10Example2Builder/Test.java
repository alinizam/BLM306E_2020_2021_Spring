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
public class Test {

    public static void main(String[] args) {
        Employee e = new Employee.Builder().firstName("Ahmet").lastName("AK").salary(1000).build();
        System.out.println(e);
        System.out.println(e.firstName + " " + e.lastName + " " + e.salary);

        /*  Employee e1=Employee.setBuilder().firstName("Ahmet").lastName("AK").salary(1000).build();
        System.out.println(e1.firstName+" "+ e1.lastName+" "+e1.salary);   
        
        Employee e2=Employee.setBuilder().firstName("Ahmet").lastName("AK").build();
        System.out.println(e2.firstName+" "+ e2.lastName+" "+e2.salary);  */
        Employee e3 = Employee.Builder.setBuilder().firstName("Ahmet").lastName("AK").salary(2000).build();
        System.out.println(e3);
        System.out.println(e3.firstName + " " + e3.lastName + " " + e3.salary);

    }
}
