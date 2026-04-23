package FinalProject.Part1;

public class Character {
    private String name;
    private int health;
    private int maxHealth;
    private int attackPower;
    private int defense;

    public Character (String name, int health,int maxHealth,int attackPower,int defense)
    {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return health;
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }

    public int getAttackPower()
    {
        return attackPower;
    }

    public int getDefense()
    {
        return defense;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public void setAttackPower(int attackPower)
    {
        this.attackPower = attackPower;
    }

    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    @Override
    public String toString()
    {
        String ret = "";
        ret = "| \u2610 " + name.toUpperCase() + "\t|\n";
        ret = spacingBar(ret);
        ret = statBlock(ret);
        ret = endingBar(ret);
        return ret;
    }

        public String spacingBar(String in)
        {
            return in + "|----------------------------------------------|\n";
        }

        public String statBlock(String in)
        {
            return in + "| ATK : " + attackPower + "\t DEF: " + defense + "\t|\n";
        }

        public static String healthBar(int current, int max) {
    int filled = (int)((current / (double) max) * 20);
    StringBuilder bar = new StringBuilder();
    for (int i = 0; i < 20; i++) {
    bar.append(i < filled ? "\u2588" : "\u2591");
    }
    return bar.toString();
    }

    public static String endingBar(String input)
    {
        String temp = "+";
        for (int i = 0; i < 20;i++)
        {
            temp += "=";
        }
        temp += "+\n";
        temp += input + "\n";
        temp += "+";
        for (int i = 0; i < 20;i++)
        {
            temp += "=";
        }
        temp += "+";
        return temp;
    }
}
