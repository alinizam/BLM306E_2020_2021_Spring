/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14Example4Observer;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Subject implements ISubject{
    ArrayList<IObserver> observers=new ArrayList();
    private int number;
    private String value;
    
    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    public ArrayList<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<IObserver> observers) {
        this.observers = observers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyObservers();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }
 
    
}
