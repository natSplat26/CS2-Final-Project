package Part1;

public class Monster extends Character {
    private int rewardXP;
    private String monsterType;
    
    
    public Monster(String name,int health,int maxHealth,int attackPower,int defense,int rewardXP,String monsterType)
    {
        super(name, health, maxHealth, attackPower, defense);
        this.rewardXP = rewardXP;
        this.monsterType = monsterType;
    }

    public int getRewardXP()
    {
        return rewardXP;
    }
    public String getMonsterType()
    {
        return monsterType;
    }
    public void setRewardXP(int x)
    {
        rewardXP =x;
    }
    public void setMonsterType(String s)
    {
        monsterType = s;
    }

    @Override
    public String toString()
    {
        String ret = "| \u2620 " + monsterType.toUpperCase() + "[Monster] \t|\n";
        ret += "| "+ getHealth() + "/" + getMaxHealth() + "\t|\n";
        ret = super.statBlock(ret);
        ret += "| Reward XP : " + rewardXP +"\t|\n";
        ret = endingBar(ret);
        return ret;
    }

    @Override
    public void attack(Character target)
    {
        System.out.println(monsterType + "Snarls and strikes!");
        target.setHealth(target.getHealth() - (this.getAttackPower()-target.getDefense()));
    }
}
