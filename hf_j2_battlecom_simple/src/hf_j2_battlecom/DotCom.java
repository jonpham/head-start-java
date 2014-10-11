/**
 * 
 */
package hf_j2_battlecom;

import java.util.ArrayList;
/**
 * @author jpdev
 *
 */
public class DotCom {
	// Declare ArrayList which will store DotCom Locations
	private ArrayList<String> locationCells;
	private String name;
	
	public void setName(String n){
		name = n;
	}
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells=loc;
	} // close setLocationCells
	
	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()){
				result = "kill";
				System.out.println("Ouch! You sunk "+name+".");
			} else {
				result = "hit";
			} // End If - no more elements
		} // End If - index exists
		return result;
	}// Close `checkYourself` method
}
