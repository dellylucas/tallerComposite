/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author girlc
 */
public class CompositeAnimal extends AbstractType {

    private List< AbstractType > animals = new ArrayList< AbstractType >();

    public CompositeAnimal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        String name = "";
        for (AbstractType child : animals) {
            name += child.getName();
        }
        return name;
    }


    public void addProduct(AbstractType animal) {
        this.animals.add(animal);
    }

    public boolean removeProduct(AbstractType animal) {
        return this.animals.remove(animal);
    }
}
