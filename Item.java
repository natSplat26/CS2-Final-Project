package FinalProject.Part1;

public class Item {
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
        itemType = i;
    }
    public void setValue(int v)
    {
        value =v;
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
}
