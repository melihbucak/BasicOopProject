package com.company;

import java.util.Scanner;

import static com.company.Main.createCharacter;

/**
 * @author mbucak on 22.04.2024 15:33
 */
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ýlk karakterin adý: ");
        String name1 = sc.nextLine();
        System.out.print("Ýlk karakterin tipi (Warrior, Mage, Archer): ");
        String type1 = sc.nextLine();
        Character character1 = createCharacter(name1, type1);
        System.out.print("Ýkinci karakterin adý: ");
        String name2 = sc.nextLine();
        System.out.print("Ýkinci karakterin tipi (Warrior, Mage, Archer): ");
        String type2 = sc.nextLine();
        Character character2 = createCharacter(name2, type2);

        System.out.println(character1.getName() + " savaþtan önceki defans: " + character1.defense);
        System.out.println(character1.getName() + " savaþtan önceki güç: " + character1.power);

        System.out.println(character2.getName() + " savaþtan önceki defans: " + character2.defense);
        System.out.println(character2.getName() + " savaþtan önceki güç: " + character2.power);

        while (!character1.isDefeated() && !character2.isDefeated()) {
            character1.attack(character2);
            if (character2.isDefeated()) {
                break;
            }
            character2.attack(character1);
        }
        if (character1.isDefeated()) {
            System.out.println("Kazanan " + character2.getName() + "!");
        } else {
            System.out.println("Kazanan " + character1.getName() + "!");
            character1.power = 12;
        }
        System.out.println(character1.getName() + " savaþtan sonraki defans: " + character1.defense);
        System.out.println(character1.getName() + " savaþtan sonraki güç: " + character1.power);

        System.out.println(character2.getName() + " savaþtan sonraki defans: " + character2.defense);
        System.out.println(character2.getName() + " savaþtan sonraki güç: " + character2.power);

    }
}
