package Part1;

public class Item implements Comparable<Item>{
    private String name;
    private String itemType;
    private int value;
    private String description;

    public Item(String n, String i, int v, String d)
    {
        name = n;
        itemType = i;
        value = v;
        description = d;
    }

    public String getName()
    {
        return name;
    }
    public String getItemType()
    {
        return itemType;
    }
    public int getValue()
    {
        return value;
    }
    public String getDescription()
    {
        return description;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setItemType(String i)
    {
        if (i.equalsIgnoreCase("WEAPON")|| i.equalsIgnoreCase("ARMOR") ||
         i.equalsIgnoreCase("POTION"))
        itemType = i.toUpperCase();
        else
        System.out.println("Invalid item storage type!");
    }
    public void setValue(int v)
    {
        if (Character.clamp(1, Integer.MAX_VALUE, v))
        value =v;
        else
        System.out.println("Item value too low!");
    }
    public void setDescription(String d)
    {
        description = d;
    }

    @Override
    public String toString()
    {
        String ret = "[" + itemType + "] " + name + " (Value : " + value + ")\n";
        ret += ">> " + description;
        return ret;
    }

    @Override
    public int compareTo(Item o) {
       return ((Integer)(value)).compareTo(o.value);
    }
}
