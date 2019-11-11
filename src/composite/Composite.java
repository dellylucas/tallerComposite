/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author girlc
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CompositeAnimal animalia = new CompositeAnimal("Animalia");
              
        CompositeAnimal chordate = new CompositeAnimal("Chordate");
        CompositeAnimal arthropo = new CompositeAnimal("Arthropoda");
        
        CompositeAnimal mammal = new CompositeAnimal("Mammal");
        CompositeAnimal insect = new CompositeAnimal("Insect");
    
        chordate.addProduct(mammal);
        arthropo.addProduct(insect);
        
        animalia.addProduct(chordate);
        animalia.addProduct(arthropo);

        
        chainAnimals chain = new chainAnimals();
        chain.addProduct(animalia);
        chain.printChain();

    }
    
}
