/**
 * 
 */
package hf_j2_battlecom;

/**
 * @author jpdev
 *
 */
public class SimpleDotCom {
	// Initialize Local Variables
	int[] locationCells;
	int numOfHits= 0;
	
	// Define Public Methods
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			} // End of If (cell : locationCells)
		} // End of For-Loop
		
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	} // Close Method 
} // Close Class
