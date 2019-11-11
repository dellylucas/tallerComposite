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

public interface AbstractType {

    List<AbstractType> getAnimals();
    String getName();

    void add(AbstractType e);

    void remove(AbstractType e);

}