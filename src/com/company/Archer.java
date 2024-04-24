package com.company;

/**
 * @author mbucak on 22.04.2024 15:30
 */
public class Archer extends Character {
    public Archer(String name) {
        super(name, 7, 7);
    }

    @Override
    public void attack(Character target) {
        target.defense -= this.power;
    }
}
