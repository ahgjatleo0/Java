package for문;

public class ex05_bonus {

	public static void main(String[] args) {

		int sum = 0;

		for(int i = 77, j =1 ; i>0; i--, j++) {
			
			sum += i*j;
			System.out.print("(" + i + "*" + j + ")" + "+");
			
		}
		System.out.println("\n" + sum);

	}

}


