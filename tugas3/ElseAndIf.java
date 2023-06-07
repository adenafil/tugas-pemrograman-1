public class ElseAndIf {
	public static void main(String[] args) {
		int people = 30;
		int cars = 40;
		int busses = 15;
		
		if (cars > people) {
			System.out.println("We should take the cars.");
			} else if (cars < people) {
			System.out.println("We should not take the cars.");
			} else {
				System.out.println("We can't decide.");
				}
				
		if (busses > cars) {
			System.out.println("That's too many busses.");
			} else if (busses < cars) {
				System.out.println("Maybe we could take the busses.");
				} else {
					System.out.println("we still can't decide.");
					}
		
		if (people > busses) {
			System.out.println("All right, let's  just take the busses.");
			} else {
				System.out.println("Fine, let's stay home then.");
				}
		
		}
	
	}
	
	/*
	answer :
	1. else if is like second condition or more condition and then "else"
	such as the last condition
	2. if "if" and "else if" get deleted than there is no condition activated after the first " if */
