/**
 * 
 */
package guess_game;

/**
 * @author jpdev
 *
 */
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void StartGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() *10);
		
		System.out.println("I'm thinking of a nnumber between 0 & 9 ....");
		
	while (true) {
			System.out.println("Numer to guess is " + targetNumber);
			// All Players make their guesses
			p1.guess();
			p2.guess();
			p3.guess();
			// All Players state their guesses
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			// We check for a correct guess
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				// We declare a winner since one of the players have gotten the right answer.
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game Over.");
				break;
			} else 
			{
				// No Players guessed the right answer this round.
				System.out.println("Players shall try again.");
			}
		}
	}
}
