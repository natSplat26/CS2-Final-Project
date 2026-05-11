package Part1;

import java.util.HashMap;

public class Dungeon {
    private HashMap<String,Room> rooms;

    public Dungeon()
    {
        rooms = new HashMap<>();
    }
    public void addRoom(Room r)
    {
        rooms.put(r.getName(),r);
    }
    public Room getRoom(String key)
    {
        return rooms.get(key);
    }
    public void listRooms()
    {
        for (String s : rooms.keySet()) {
            System.out.println(rooms.get(s).getName() + "Visited: [" +rooms.get(s).isVisited() + "]");
        }
    }
    public String toString()
    {
        String s = "#==========================#\n";
        s+= "#\t DUNGEON MAP \t \t\t#\n";
        s += "#==========================#\n";
        for (String key : rooms.keySet()) {
            String temp = (rooms.get(key).isVisited())? "X" : "";
            s+= "#\t [" + temp + "] " + rooms.get(key).getName() + "\t\t#\n";
        }
        s+="# [X] = visited \t\t#\n";
        s += "#==========================#";
        return s;
    }
}
