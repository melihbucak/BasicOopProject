package com.company;

public class Main {
    public static Character createCharacter(String name, String type) {
        if (type.equalsIgnoreCase("Warrior")) {
            return new Warrior(name);
        } else if (type.equalsIgnoreCase("Mage")) {
            return new Mage(name);
        } else if (type.equalsIgnoreCase("Archer")) {
            return new Archer(name);
        } else {
            throw new IllegalArgumentException("Invalid character type: " + type);
        }
    }
}
