public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		
		myName = "Zed A. Shaw";
		myAge = 35;
		myHeight = 74;
		myWeight = 180;
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		double meters = myHeight * 0.0254;
		double kg = myWeight * 0.453592;
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " (" + meters + ") inches tall.");
		System.out.println("He's " + myWeight + " pounds heavy or in kg = " + kg + ".");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair. ");
		System.out.println("His teeths are usually " + myTeeth + " depending on the coffee ");
		
		// this is line is tricky; try to get it exactly right.
		System.out.println("If i add " + myAge + ", " + myHeight + ", and " + myWeight + " i get " + (myAge + myHeight + myWeight ) + ".");
		
		}
	
	}
