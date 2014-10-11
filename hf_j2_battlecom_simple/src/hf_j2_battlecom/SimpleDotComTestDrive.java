package hf_j2_battlecom;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// instantiate SimpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();
		
		// create initialLocations Array
		int[] locations = {2,3,4};
		dot.setLocationCells(locations); // set .Com Location from locations array
		
		String userGuess = "2";
		String result= dot.checkYourself(userGuess);
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
	
		System.out.println(testResult);
	}

}
