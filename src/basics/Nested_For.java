package basics;

public class Nested_For {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {  // 10
			for (int j = 1; j <= 5; j++) {  //5
				System.out.println(i + "," + j);  // 1,1 1,2 1,3 1,4 a,5 
			}
			System.out.println("All Iterations of J are Done");
		}
	}

}
