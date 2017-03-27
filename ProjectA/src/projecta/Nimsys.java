/*
 * Programming & Software Development Project A
 * Created by Haaris Ahmad
 * Date: 26 / 03 / 2017
*/
package projecta;
import java.util.Scanner;

public class Nimsys 
{
    // handles the printing of stones
    public static void printStones(int numberOfStones) 
    {
        System.out.print(numberOfStones + " stones left:");
        for(int i=0;i<numberOfStones;i++)       
            System.out.print(" *");
        
        System.out.print("\n");
    }
    
    // handles the user's input for stone removal selection only
    public static int getPlayerTurn(NimPlayer player,int numberOfStones,Scanner inputScan) 
    {
        System.out.println(player.getPlayerName() + "'s turn - remove how many?\n");
        int removeStones = player.removeStone(inputScan);
        numberOfStones = numberOfStones - removeStones;
        
        return numberOfStones;
    }
    
    // main game function
    public static void gameStart(NimPlayer player1, NimPlayer player2, Scanner inputScan) 
    {
        String winner = "";
        Boolean gameCheck = true;
        
        while(gameCheck)
        {
            System.out.print("\n");
            System.out.println("Please enter upper bound of stone removal:");
            int upperBound = inputScan.nextInt();
            System.out.print("\n");
            System.out.println("Please enter initial number of stones:");
            int stones = inputScan.nextInt();
            System.out.print("\n");
            
            //Main game Loop
            while(stones !=0)
            {
                printStones(stones);
                stones = getPlayerTurn(player1,stones,inputScan);
                
                if(stones < 1)
                    winner = player2.getPlayerName();
                else 
                {
                    printStones(stones);
                    stones = getPlayerTurn(player2,stones,inputScan);
                    if(stones < 1)
                        winner = player1.getPlayerName();
                }
            }

            System.out.println("Game Over");
            System.out.println(winner + " wins!"); //player wins
            System.out.print("\n");
            System.out.print("Do you want to play again (Y/N):");
            
            //Checks for game replay
            if(inputScan.next().toUpperCase().equals("Y"))
                gameCheck = true;
            else 
                gameCheck = false;
        }
    }
       
    public static void main(String[] args) 
    {
        Scanner inputScan = new Scanner(System.in);
        
        System.out.println("Welcome to Nim\n");
        
        System.out.println("Please enter Player 1's name:");
        NimPlayer player1 = new NimPlayer(inputScan.next());
        System.out.print("\n");
        
        System.out.println("Please enter Player 2's name:");
        NimPlayer player2 = new NimPlayer(inputScan.next());
        gameStart(player1,player2,inputScan); //** Start game Function **
    }
}
