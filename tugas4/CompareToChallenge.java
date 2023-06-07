public class CompareToChallenge {
	public static void main(String[] args) {
		
		// 2 example of compareToChallange
		
		System.out.print("Comparing \"axe\" with \"dog\" procedures ");
		int a = "axe".compareTo("dog");
		System.out.println(a);
		
		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println("applebee's".compareTo("apple")); 
		
		
		
		
		// first example of negativ result && positive result
		String[] dataEg = {"fortuner", "renutrof", "pajero", "avanza", "azanav", "misuze", "gundou", "wildan", "aryo", "coach justin", "epep", "valorant", "crisisAction", "anceloti", "breakingBad"};
		System.out.print("==========This is for negative result=============");
		checkerNeg(dataEg);
		System.out.print("\n\n\n\r==========This is for positive=============\n");
		checkerPos(dataEg);
		
		System.out.print("\n\n\n\r==========This is for 0 reault=============\n");
		System.out.print("Comparing \"axe\" with \"axe\" procedures ");
		a = "axe".compareTo("axe");
		System.out.println(a);
		
		System.out.print("Comparing \"nafil\" with \"nafil\" produces ");
		System.out.println("nafil".compareTo("nafil")); 
		}
		
		public static void checkerNeg (String[] dataEg) {
					
		for (int i = 0; i <= dataEg.length; i++) {
			if (i == dataEg.length-1) {
				break;
					}
			int result = dataEg[i].compareTo(dataEg[i+1]);
			
			if (result < 0 ) {
			System.out.print("Comparing " + dataEg[i] + " with " + dataEg[i + 1] + " produces ");	
			System.out.println(result);
				} 
			} 
		}
			
			public static void checkerPos (String[] dataEg) {
					
			for (int i = 0; i <= dataEg.length; i++) {
			if (i == dataEg.length-1) {
				break;
					}
			int result = dataEg[i].compareTo(dataEg[i+1]);
			
			
			if (result > 0) {
			System.out.print("Comparing " + dataEg[i] + " with " + dataEg[i + 1] + " produces ");	
			System.out.println(result);
					}
			
			} 



			}
	}
