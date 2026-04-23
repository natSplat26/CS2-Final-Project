package FinalProject.Part1;

public class main {

    public static void main(String[] args) {
        Hero h = new Hero("james", 80, 100, 8, 4, 1, 0, "Warrior");
    Monster m1 = new Monster("tim", 10, 10, 2, 1, 15, "Goblin");
    Monster m2 = new Monster("john", 5, 30, 7, 0, 50, "Minotaur");
    Item i1 = new Item("Sword", "WEAPON", 15, "A dull iron sword");
    Item i2 = new Item("Invisibility Potion", "POTION", 100, "A viscous fluid stored in an opaque flask");
    Item i3 = new Item("chainmail", "ARMOR", 30, "Typical chainmail armor");
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
    }
    
}
