package Part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Inventory<T extends Item> {
    private HashSet<T> items;

    public Inventory()
    {
        items = new HashSet<T>();
    }

    public void addItem(T item)
    {
        items.add(item);
    }
    public void removeItem(T item)
    {
        items.remove(item);
    }
    public boolean hasItem(T item)
    {
        return items.contains(item);
    }

    public void displaySorted()
    {
        ArrayList<T> list = new ArrayList<>(items);
        Collections.sort(list);
        for (T t : list) {
            
            System.out.println("[" + t.getItemType().toUpperCase() + "] " + t.getName() + "\t(value: " + t.getValue() + ")");
        }
    }

    public int getSize()
    {
        return items.size();
    }
}
