package Part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Room implements Interactable {
    private String name;
    private String description;
    private ArrayList<Item> items;
    private ArrayList<Monster> monsters;
    private boolean visited;
    private Queue<Monster> spawnQueue;
    public Room(String n,String d)
    {
        this.name = n;
        description = d;
        items = new ArrayList<>();
        monsters = new ArrayList<>();
        visited = false;
        spawnQueue = new LinkedList<>();
    }
    public String getName()
    {
        return name;
    }

    public void addItem(Item i)
    {
        items.add(i);
    }
    public void addMonster(Monster m)
    {
        monsters.add(m);
    }
    public ArrayList<Item> getItems()
    {
        return items;
    }
    public ArrayList<Monster> getMonsters()
    {
        return monsters;
    }
    public boolean isVisited()
    {
        return visited;
    }
    public void setVisited(boolean v)
    {
        visited = v;
    }
    public Monster spawnNextMonster()
    {
        return spawnQueue.poll();
    }
    public void loadMonsters()
    {
        for (Monster m : monsters) {
            spawnQueue.offer(m);
        }
    }
    public boolean hasMonsters()
    {
        return !spawnQueue.isEmpty();
    }

    @Override
    public String toString()
    {
        String ret = "#";
        for (int i = 0; i < 20;i++)
            ret += "=";
        ret += "#\n";
        ret += "# ROOM: " + name + "\t#\n";
        ret += "# " + description + "\t#\n";
        ret += "#--------------------------------------------#\n";
        ret += "# Items :";
        for (int i = 0; i < items.size();i++)
            {
                ret += items.get(i).getName();
                if (i < items.size() - 1)
                    ret += ",";
            } 
        ret += "\t#\n";
        ret += "# Monsters: ";
         for (int i = 0; i < monsters.size();i++)
            {
                ret += monsters.get(i).getMonsterType();
                if (i < monsters.size() - 1)
                    ret += ",";
            }
        ret += "\t#\n";
        ret += "# VISITED : " + visited + "\t#\n";
        ret += "#";
        for (int i = 0; i < 20;i++)
            ret += "=";
        ret += "#";
        return ret;
    }

    @Override
    public void interact(Hero hero) {
        visited = true;
        loadMonsters();
        while(!spawnQueue.isEmpty())
        {
            Monster m = spawnQueue.poll();
            while (m.getHealth() > 0 && hero.getHealth() > 0)
            {
                m.attack(hero);
                hero.attack(m);
            }
        }
        System.out.println(this);
        for (Item item : items) {
            if (item instanceof Potion)
            ((Potion) (item)).interact(hero);
        if (item instanceof Weapon)
            ((Weapon) (item)).interact(hero);
        if (item instanceof Armor)
            ((Armor) (item)).interact(hero);
        }
        
    }
}
