package Part1;

public class Potion  extends Item implements Interactable{

    public Potion(String n, int v, String d) {
        super(n, "Potion", v, d);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void interact(Hero hero) {
        System.out.println("✨" + hero.getName() + " drinks " + getName() + " and recovers " + getValue() + " HP!");
        hero.setHealth(hero.getHealth()+getValue());
    }
    
}
