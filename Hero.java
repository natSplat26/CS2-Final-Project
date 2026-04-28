package Part1;

public class Hero extends Character {
    private int level;
    private int experiencePoints;
    private String heroClass;

    public Hero(String name,int health,int maxHealth,int attackPower,int defense,int level,int experiencePoints,String heroClass)
    {
        super(name, health, maxHealth, attackPower, defense);
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.heroClass = heroClass;
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
        target.setHealth(target.getHealth() - (this.getAttackPower()-target.getDefense()));
    }
}
