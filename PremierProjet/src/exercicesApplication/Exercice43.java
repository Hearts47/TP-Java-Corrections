package exercicesApplication;

public class Exercice43 {

	
	public static void executer() {
		
		int [] notes = {19, 12 , 8 , 15 , 3 , 19 , 7 , 14 , 5};
		
		for (int v : notes) {
			
			
			
			if (v == 19) {
				
				break;
				
			} else if (v < 5) {
				
				continue;
			
			} else if (v >= 10) {
				
				System.out.println(v);
			}
		}
		
	}
	
}
