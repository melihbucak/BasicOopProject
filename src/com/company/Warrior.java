package com.company;

/**
 * @author mbucak on 22.04.2024 15:27
 */
public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 15, 10);
    }

    @Override
    public void attack(Character target) {
        target.defense -= this.power + 2;
    }
}
