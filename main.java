package Part1;

import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        Hero h = new Hero("james", 80, 100, 8, 4, 1, 0, "Warrior");
    Monster m1 = new Monster("tim", 10, 10, 2, 1, 15, "Goblin");
    Monster m2 = new Monster("john", 5, 30, 7, 0, 50, "Minotaur");
    Weapon i1 = new Weapon("Sword", 15, "A dull iron sword");
    Potion i2 = new Potion("Invisibility Potion",  100, "A viscous fluid stored in an opaque flask");
    Armor i3 = new Armor("chainmail", 30, "Typical chainmail armor");
    Room baseRoom = new Room("Basement", "A damp basement that hasn't been opened in ages");

    baseRoom.addMonster(m1);
    baseRoom.addMonster(m2);
    baseRoom.addItem(i1);
    baseRoom.addItem(i2);
    baseRoom.addItem(i3);

    System.out.println("Printing Hero:");
    System.out.println(h);

    System.out.println("Printing Monsters:");
    System.out.println(m1);
    System.out.println(m2);

    System.out.println("Printing Room:");
    System.out.println(baseRoom);

    System.out.println("Hero stat block before interaction");
    System.out.println(h);
    baseRoom.interact(h);
    System.out.println();
    System.out.println("Hero stat block after interaction");
    System.out.println(h);
    h.setHealth(-50);
    h.setAttackPower(0);
    System.out.println();

    Potion p = new Potion("potion", 1, "the first item");
    ArrayList<Item> items = new ArrayList<>();
    items.add(i1);
    items.add(i2);
    items.add(p);
    items.add(i3);
    Collections.sort(items);
    for (Item item : items) {
        System.out.println(item);
    }
    }// it sorts this way because its compared least to greatest
    
}
