/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigrama;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delly
 */
public class CompositeCharges extends AbstractType {

    private List<AbstractType> charges = new ArrayList<>();

    public CompositeCharges(String name) {
        super(name);
    }

    @Override
    public void add(AbstractType e) {
        if (e != null) {
            this.charges.add(e);
        }
    }

    @Override
    public void remove(AbstractType e) {
        if (e != null) {
            this.charges.remove(e);
        }
    }

    @Override
    public void getName() {
        System.out.println(this.name);
        for (AbstractType child : charges) {
            child.getName();
        }
    }

    @Override
    public void getHigherNumLetter(String higherName) {
        for (AbstractType child : charges) {
            if (higherName.length() > name.length()) {
                child.getHigherNumLetter(higherName);
            } else {
                child.getHigherNumLetter(name);
            }
        }
    }
      @Override
    public void determinateHigher() {
     getHigherNumLetter("");
    }
}
