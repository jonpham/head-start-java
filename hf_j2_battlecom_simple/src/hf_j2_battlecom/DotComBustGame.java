package hf_j2_battlecom;
import java.util.ArrayList;

public class DotComBustGame {
	// Create Local Objects / Variables
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	int numOfGuesses = 0;
	
	// Declare Public Methods;
	public void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println("You're goal is to sink three dot-coms.");
		System.out.println("Pets.com, eToys.com, & Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses.");
		
		for (DotCom dotComToSet: dotComsList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		} // Close For Loop of dotComs
	} // close SetupGame()
	
	public void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a Guess: ");
			checkUserGuess(userGuess);
		} // close while
		finishGame();
	} // close Method 'startPlaying()'
	
	public void checkUserGuess(String userGuess){
		numOfGuesses++; 
		String result = "miss";
		
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			else if (result.equals("kill")){
				dotComsList.remove(dotComToTest);
				break;
			}
		} //close For Loop of DotComs
		System.out.println(result);
	} // close Method 'checkUserGuess'
	
	public void finishGame() {
		// game finish
		System.out.println("All Dot Coms are Dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you "+numOfGuesses+" guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough, "+numOfGuesses+" guesses...");
			System.out.println("Fish are dancing with your options.");
		} // Close If/Else Statements
	} // Close Method
	
	// Declare MAIN Class
	public static void main(String[] args) {
		DotComBustGame game = new DotComBustGame();
		game.setUpGame();
		game.startPlaying();
	}
}
