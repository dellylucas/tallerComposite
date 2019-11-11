/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author girlc
 */
public class CompositeAnimal implements AbstractType {

    private List< AbstractType> animals = new ArrayList<>();
    private String name;

    public CompositeAnimal(String name) {
        this.name = name;
    }

    @Override
    public List<AbstractType> getAnimals() {
        return this.animals;
    }

    @Override
    public void add(AbstractType e) {
        if (e != null) {
            this.animals.add(e);
        }
    }

    @Override
    public void remove(AbstractType e) {
        if (e != null) {
            this.animals.remove(e);
        }
    }

    @Override
    public String getName() {
        String name = "";
        System.out.println(this.name);
        for (AbstractType child : animals) {
            child.getName();
        }
        return name;
    }
}
