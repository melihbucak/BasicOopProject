package com.company;

/**
 * @author mbucak on 22.04.2024 15:29
 */
public class Mage extends Character {
    public Mage(String name) {
        super(name, 10, 5);
    }

    @Override
    public void attack(Character target) {
        target.defense -= this.power * 2;
    }
}
