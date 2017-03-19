package projecta;
import java.util.Scanner;

public class Nimsys 
{
    public static void main(String[] args) 
    {
        //all variables
        Scanner scan = new Scanner(System.in);
        Boolean gameCheck = true;
        int upperBound;
        int stones;
        int turnInput;
        NimPlayer player1;
        NimPlayer player2;
        
        System.out.println("Welcome to Nim");
        System.out.println("Please enter Player 1's name");
        player1 = new NimPlayer(scan.next());
        
        System.out.println("Please enter Player 2's name");
        player2 = new NimPlayer(scan.next());
        
        
        if(gameCheck)
        {
            System.out.println("Please enter upper bound of stone removal");
            upperBound = scan.nextInt();

            System.out.println("Please enter initial number of stones");
            stones = scan.nextInt();

            System.out.print(stones + " stones left: ");


            //Main game Loop
            for(int i=0;i<stones;i++)
                System.out.print('*');

            System.out.println(); //blank line
            System.out.println(player1.getPlayerName() + "'s turn - remove how many?");
            turnInput = scan.nextInt();

            for(int i=0;i<stones;i++)
                System.out.print('*');

            System.out.println(); //blank line
            System.out.println(player2.getPlayerName() + "'s turn - remove how many?");
            turnInput = scan.nextInt();



            System.out.println("Game Over");
            //System.out.println( + " Wins"); //player wins
            
            System.out.print("Do you want to play again (Y/N): ");
            if(scan.next().toUpperCase().equals('Y'))
                gameCheck = true;
            else 
                gameCheck = false;
                
        
        }
        
        
    }
}
