package Part1;

public class Hero extends Character {
    private int level;
    private int experiencePoints;
    private String heroClass;
    private Inventory<Item> inventory;

    public Hero(String name,int health,int maxHealth,int attackPower,int defense,int level,int experiencePoints,String heroClass)
    {
        super(name, health, maxHealth, attackPower, defense);
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.heroClass = heroClass;
        inventory = new Inventory<>();
    }
    public Inventory<Item> getInventory()
    {
        return inventory;
    }
    public int getLevel()
    {
        return level;
    }
    public int getExperiencePoints()
    {
        return experiencePoints;
    }
    public String getHeroClass()
    {
        return heroClass;
    }

    public void setLevel(int level)
    {
        if (clamp(1, 99, level))
        this.level = level;
        else
        System.out.println("Value for hero level is either too high or too low!");
    }
    public void setExperiencePoints(int experiencePoints)
    {
        if (clamp(0, Integer.MAX_VALUE, experiencePoints))
        this.experiencePoints = experiencePoints;
        else
        System.out.println("Value for experience points is too low!");
    }
    public void setHeroClass(String heroClass)
    {
        this.heroClass = heroClass;
    }

    @Override
    public String toString()
    {
        String ret = "| \u2610 " + getName().toUpperCase() + "[" + heroClass + "] Level " + level + "\t|\n";
        ret = super.spacingBar(ret);
        ret += "| "+ getHealth() + "/" + getMaxHealth() + "\t|\n";
        ret += super.healthBar(getHealth(), getMaxHealth()) + "\n";
        ret = super.statBlock(ret);
        ret += "Inventory size: " + inventory.getSize() + "\n";
        ret = endingBar(ret);
        return ret;
    }

    public void gainExperience(int xp)
    {
        if (clamp(0, Integer.MAX_VALUE, xp))
        experiencePoints += xp;
        else
        System.out.println("Value for xp gain too low!");
    }

    @Override
    public void attack(Character target)
    {
        String targetName = target.getName();
        if (target instanceof Monster)
            targetName = ((Monster)(target)).getMonsterType();
        int damage = (getAttackPower() > target.getHealth() + target.getDefense())? target.getHealth() : getAttackPower() - target.getDefense();
        damage = (damage < 0)? 0 : damage;
        target.setHealth(target.getHealth() - damage);
        System.out.println("[COMBAT] " + getName() + " hits " + targetName + " for " + damage + " hp! " + targetName + " HP: " + target.getHealth() + " / " + target.getMaxHealth() );
        if (target.getHealth() == 0)
        {
            String reward = "";
            if (target instanceof Monster)
                reward = " and gained " + ((Monster)(target)).getRewardXP();
            System.out.println("[VICTORY] " + getName() + " has slain the " + targetName + reward );
            gainExperience(((Monster)(target)).getRewardXP());
        }
    }
}
