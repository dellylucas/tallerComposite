/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.List;

/**
 *
 * @author girlc
 */
public class SimpleAnimal implements AbstractType {
 String name;
    public SimpleAnimal(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        System.out.println(name);
        return this.name;
    }

    @Override
    public void add(AbstractType e) {
       
    }

    @Override
    public void remove(AbstractType e) {
       
    }

    @Override
    public List<AbstractType> getAnimals() {
       // nothing to implement
     return null;
    }
       @Override
    public String toString() {
        return  getName();
    }

}
