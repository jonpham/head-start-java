/**
 * 
 */
package hf_j2_battlecom;
import java.io.*;
import java.util.*;
/**
 * @author jpdev
 *
 */
public class GameHelper {
	// Declare Local Variables & Objects
	private static final String alphabet = "abcdefg"; // 7 x 7 Grid == only 7 Letters
	private int gridLength = 7;
	private int gridSize = (int) Math.pow(gridLength, 2);
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt+"  ");
		try {
			BufferedReader is = new BufferedReader (
					new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: "+e);
		} // End Try / Catch
		return inputLine.toLowerCase();
	}// Close Method

	public ArrayList<String> placeDotCom(int comSize) {
		// Declare Function Locals
		ArrayList<String> alphaCells = new ArrayList<String>(); 
		String [] alphacoords = new String [comSize];		// ArrayList to Hold AlphaNumeric Coordinates
		String temp = null;									// Temporary String for concat
		int [] coords = new int[comSize];					// current candidate coords
		int attempts = 0 ; 									// current attempts counter
		boolean success = false;							// flag to indicate good location
		int location = 0; 									// current starting location
		
		comCount++;											// nth dotcom is being placed
		int incr = 1;										// set horizontal increment
		if ((comCount % 2)==1) { 							// if Statement that makes all odd numbered dotcoms
			incr = gridLength;								// into vertically placed targets by adding incrementing the next coordinate by a row length
		}
		
		while ( (!success) & (attempts++ < 200) ) {
			location = (int) (Math.random()*gridSize); 	// Get Random location within `grid`
			System.out.println("try "+location);       	// Output potential location
			int x = 0 ; 								// Initialize counter to indicate which dotcom coordinate is being placed
			
			success = true;
			while (success && (x < comSize)){
				if (grid[location]==0) {				// Assumes that grid[int] initializes with 0's
					coords[x++] = location;
					location += incr;					// add `incr` to original coordinate.
					
				}
			}
		}
		return alphaCells;
	}
} // Close Class
