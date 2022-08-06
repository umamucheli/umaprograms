import java.util.Scanner;
class Guesser
{
	int guessNum;
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Player
{
	int guessNum;
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
    void collectNumFromPlayer()
    {
    	Player p1=new Player();
    	Player p2=new Player();
    	Player p3=new Player();
    	numFromPlayer1=p1.guessNumber();
    	numFromPlayer2=p2.guessNumber();
    	numFromPlayer3=p3.guessNumber();
     }
    public   void compare()
      {
      	if(numFromGuesser==numFromPlayer1)
      	{
      		if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
      		{
      			System.out.println("Game tied all three palyers guessed correctly");
      		}
      		else if(numFromGuesser==numFromPlayer2)
      		{
      			System.out.println("Player 1 and Player 2 won the game");
      		}
      		else if(numFromGuesser==numFromPlayer3)
      		{
      			System.out.println("Player 1 and Player 3 won the game");
      		}
      		else
      		{
      			System.out.println("Player 1 won the game");
      		}
      	}
        else if(numFromGuesser==numFromPlayer2)
        {
        	if(numFromGuesser==numFromPlayer3)
        	{
        		System.out.println("Player 1 and Player 3 won the game");
        	}
        	else
        	{
        		System.out.println("Game lost try again!");
        	}
          }
         }
        }
       public class Launch{
         	public static void main(String[] args) {
         		Umpire u=new Umpire();
         		u.collectNumFromGuesser();
         		u.collectNumFromPlayer();
         		u.compare();

         	}
         }