/**
 * 
 */
package hf_j2_battlecom;
import java.util.ArrayList;
/**
 * @author jpdev
 * Main Game Class for SimpleDotComGame
 */
public class SimpleDotComGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numOfGuesses = 0 ; 
		
		GameHelper helper = new GameHelper();
		
		// SimpleDotCom theDotCom = new SimpleDotCom();
		DotCom theDotCom = new DotCom();
		
		int randomNum = (int) (Math.random() * 5);
		ArrayList<String> locations = new ArrayList<String>();
		for (int i = 0; i<3 ; i++) {
			locations.add(Integer.toString(randomNum+i));
		}
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("Enter a Number: ");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			
			if (result.equals("kill")){
				isAlive = false;
				System.out.println("You took "+numOfGuesses+" guesses.");
			} // close if 
		} // close while

	} //close Class Main

}
