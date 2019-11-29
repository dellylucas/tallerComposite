/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigrama;

import java.util.List;

/**
 *
 * @author delly
 */
public abstract class AbstractType {

    String name;

    public AbstractType(String name) {
        this.name = name;
    }

    abstract public void determinateHigher();
    abstract public void getHigherNumLetter(String higherName);
    
    abstract public void getName();

    abstract public void add(AbstractType e);

    abstract public void remove(AbstractType e);
}
