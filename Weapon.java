package Part1;

public class Weapon extends Item implements Interactable{

    public Weapon(String n, int v, String d) {
        super(n,"Weapon", v, d);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void interact(Hero hero) {
        hero.setAttackPower(hero.getAttackPower() + getValue());
        System.out.println("⚔ " + hero.getName() + " equips " + getName() + "! ATK+" + getValue());
    }
    
}
