package com.company;

/**
 * @author mbucak on 22.04.2024 15:05
 */

public abstract class Character {
    private String name;
    int power;
    int defense;

    public Character(String name, int power, int defense) {
        this.name = name;
        this.power = power;
        this.defense = defense;
    }

    public abstract void attack(Character target);

    public void defend(int amount) {
        this.defense += amount;
    }

    public boolean isDefeated() {
        return defense <= 0;
    }

    public String getName() {
        return this.name;
    }
}
