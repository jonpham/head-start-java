/**
 * 
 */
package guess_game;

/**
 * @author jpdev
 *
 */
public class Player {
	// Properties
	int number = 0;
	
	// Methods
	public void guess () {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
	
	
}
