/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson09.Example3;

/**
 *
 * @author alinizam
 */
public interface AbstractFactory {
    Product create(IProductEnum componentType);
}