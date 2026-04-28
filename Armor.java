package Part1;

public class Armor extends Item implements Interactable {

    public Armor(String n, int v, String d) {
        super(n, "Armor", v, d);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void interact(Hero hero) {
        hero.setDefense(hero.getDefense()+getValue());
        System.out.println("🛡" + hero.getName() + " equips " + getName() + "! DEF +" + getValue() );
    }
    
}
