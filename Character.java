package Part1;

public abstract class Character {
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
        if (clamp(0, maxHealth, health))
        this.health = health;
        else
        System.out.println("Value for health either too high or too low!");
    }

    public void setMaxHealth(int maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public void setAttackPower(int attackPower)
    {
        if (clamp(1,Integer.MAX_VALUE, attackPower ))
        this.attackPower = attackPower;
        else
        System.out.println("Value for attack power is too low!");
    }

    public void setDefense(int defense)
    {
        if (clamp(0, Integer.MAX_VALUE, defense))
        this.defense = defense;
        else
        System.out.println("Value for defense is too low!");
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

    public static boolean clamp(int low,int high,int in)
    {
        if (in < low)
            return false;
        if (in > high)
            return false;
        return true;
    }
    public abstract void attack(Character target);
}
