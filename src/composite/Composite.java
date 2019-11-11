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
      AbstractType animalia = new SimpleAnimal("Animalia");
              
        AbstractType chordate = new CompositeAnimal("Chordate");
        AbstractType arthropo = new CompositeAnimal("Arthropoda");
        
        AbstractType mammal = new CompositeAnimal("Mammal");
        AbstractType insect = new CompositeAnimal("Insect");
           
        AbstractType dipter = new CompositeAnimal("Diptera");
        AbstractType carniv = new CompositeAnimal("Carnivora");
        AbstractType primate = new CompositeAnimal("Primate");
        
        
        AbstractType musida = new CompositeAnimal("Muscidae");
        AbstractType felidae = new CompositeAnimal("Felidae");
        AbstractType pongidae = new CompositeAnimal("Pongidae");
        AbstractType hominidae = new CompositeAnimal("Hominidae");
        
             
        AbstractType musca = new CompositeAnimal("Musca");
        AbstractType felis = new CompositeAnimal("Felis");
        AbstractType pan = new CompositeAnimal("Pan");
        AbstractType homo = new CompositeAnimal("Homo");
        
        AbstractType domesticaM = new CompositeAnimal("Domestica");
        AbstractType leo = new CompositeAnimal("Leo");
        AbstractType domesticaF = new CompositeAnimal("Domestica");
        AbstractType troglodytes = new CompositeAnimal("Troglodytes");
        AbstractType sapiens = new CompositeAnimal("Sapiens");
        
        AbstractType housefly = new CompositeAnimal("Housefly");
        AbstractType lion = new CompositeAnimal("Lion");
        AbstractType houseCat = new CompositeAnimal("House Cat");
        AbstractType chimpanzee = new CompositeAnimal("Chimpanzee");
        AbstractType human = new CompositeAnimal("Human");
        
        chordate.add(animalia);
        arthropo.add(animalia);
        
        mammal.add(chordate);    
        insect.add(arthropo);

        primate.add(mammal);    
        carniv.add(mammal); 
        dipter.add(insect);
        
         musida.add(dipter);    
        felidae.add(carniv); 
        pongidae.add(primate);
        hominidae.add(primate);
             
         musca.add(musida);    
        felis.add(felidae); 
        pan.add(pongidae);
        homo.add(hominidae);
        
       domesticaM.add(musca);    
        leo.add(felis); 
        domesticaF.add(felis);
        troglodytes.add(pan);
        sapiens.add(homo);
               
       housefly.add(domesticaM);    
        lion.add(leo); 
        houseCat.add(domesticaF);
        chimpanzee.add(troglodytes);
        human.add(sapiens);
        
        //imprimir cadena de:
        human.getName();
    }
    
}
