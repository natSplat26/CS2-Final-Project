package FinalProject.Part1;

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
        this.level = level;
    }
    public void setExperiencePoints(int experiencePoints)
    {
        this.experiencePoints = experiencePoints;
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
        experiencePoints += xp;
    }
}
