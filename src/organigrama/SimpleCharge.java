/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigrama;

/**
 *
 * @author delly
 */
public class SimpleCharge extends AbstractType {

    public SimpleCharge(String name) {
        super(name);
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void add(AbstractType e) {

    }

    @Override
    public void remove(AbstractType e) {

    }

    @Override
    public void getHigherNumLetter(String higherName) {
        if (higherName.length() > name.length()) {
            System.out.println(higherName + " -tamaño: " + higherName.length());
        } else {
            System.out.println(name + " -tamaño: " + name.length());
        }
    }

    @Override
    public void determinateHigher() {
     getHigherNumLetter("");
    }
}
