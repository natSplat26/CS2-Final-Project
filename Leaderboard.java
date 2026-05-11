package Part1;

import java.util.HashMap;

public class Leaderboard {
    private HashMap<String,Integer> scores;
    public Leaderboard()
    {
        scores = new HashMap<>();
    }
    public void addScore(String name,int score)
    {
        scores.put(name, score);
    }
    public Integer getScore(String name)
    {
        if (scores.containsKey(name))
            return scores.get(name);
        return 0;
    }
    public void printLeaderboard()
    {
        System.out.println("+=============================+");
        System.out.println("| \t Leaderboard \t |");
        System.out.println("+=============================+");
        for 
    }
}
