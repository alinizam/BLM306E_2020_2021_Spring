/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Example3;

/**
 *
 * @author alinizam
 */
public class ImprovedTest {
    public static void main(String[] args) {
        AbstractFactory f=new ComponentFactory();
        Product p=f.create(ComponentFactory.compType.BUTTON);
        System.out.println(p.toString());
        f=new ShapeFactory();
        p=f.create(ShapeFactory.shapeTypeEnum.RECTANGLE);

    }
}
