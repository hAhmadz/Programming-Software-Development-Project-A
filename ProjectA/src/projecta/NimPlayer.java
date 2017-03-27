//Player Class handles the player data

package projecta;
import java.util.Scanner;

public class NimPlayer 
{
    private String playerName;
    
    // *** constructors ***
    NimPlayer()
    {
        playerName = "";
    }
    
    NimPlayer(String name)
    {
        playerName = name;
    }
    
    // *** Functions ***
    public String getPlayerName() 
    {
        return playerName;
    }
    
    public void setPlayerName(String playerName) 
    {
        this.playerName = playerName;
    }

    public int removeStone(Scanner input)
    {
        int removeStones = 0;
        return removeStones = input.nextInt();
    }
}
