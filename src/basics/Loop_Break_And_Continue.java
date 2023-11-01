package basics;

public class Loop_Break_And_Continue {

	public static void main(String[] args) {
		
		int a = 100;
		
		/*
		 * while (a > 50) { a-=5; if (a == 75) { continue; } System.out.println(a); }
		 */
		
		for (int i=0; i<10; i++) {
		 
			if(i == 4) {
			 continue;
						}
			System.out.println(i);
		}
}
	
	// i=0 , 0 != 4, 0
	// i= 1,      1
	//2 
	//3
	//
	
	
}
