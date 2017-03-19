//Player Class

package projecta;
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
    
    //*** End Constructors ***

    
    // *** Functions ***
    public String getPlayerName() {
        return playerName;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

//    public int removeStone()
//    {
//        
//        return stones;
//    }
    
    // *** End Functions ***

    

    
}
