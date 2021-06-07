/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Example3NullObject;

import com.sun.org.apache.regexp.internal.RE;
import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class CustomerFactory {
    static ArrayList<AbstractCustomer> customers=new ArrayList();
    static void addCustomer(String name){
        if (!"".equals(name)){
            AbstractCustomer realCustomer=new RealCustomer();
            realCustomer.name=name;      
            customers.add(realCustomer);
        }
        else{
            AbstractCustomer nullCustomer=new NullCustomer();
            nullCustomer.name="No name";
            customers.add(nullCustomer); 
        }
             
    
    }
}
