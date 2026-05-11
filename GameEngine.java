package Part1;

import java.util.Stack;

public class GameEngine {
    private Stack<Room> navStack;
    private Hero mainHero;

    public GameEngine(Hero h)
    {
        navStack = new Stack<>();
        mainHero =h;
    }

    public void prevRoom()
    {
        navStack.pop();
        System.out.println("< Going Back ... now in: " + navStack.peek().getName());
    }
    public void enterRoom(Room r)
    {
        navStack.push(r);
        r.interact(mainHero);
        System.out.println("> Entering: " + navStack.peek().getName());
    }
    public Room peek()
    {
        System.out.println("- Currently in: " + navStack.peek().getName());
        return navStack.peek();
    }

}
