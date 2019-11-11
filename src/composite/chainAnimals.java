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
public class chainAnimals {
    private List animals = new ArrayList();
    private String name;

    public chainAnimals( String name) {
        super();
        this.name = name;
    }

    public List getProducts() {
        return animals;
    }

    public void setProducts(List animals) {
        this.animals = animals;
    }

    public String getName() {
         String name = "";
        for (Iterator it = animals.iterator(); it.hasNext();) {
            AbstractType child = (AbstractType) it.next();
            name += child.getName();
        }
        return name;
    }

    public void addProduct(AbstractType animal) {
        animals.add(animal);
    }

    public void removeProduct(AbstractType animal) {
        animals.remove(animal);
    }

    public void printChain() {
    
        for (Iterator it = animals.iterator(); it.hasNext();) {
              System.out.println("\n=============================================n");
            AbstractType prod = (AbstractType) it.next();
            System.out.println(prod.getName());
        } 
    }
}
