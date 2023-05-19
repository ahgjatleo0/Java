package festival_문제순서대로;

public class ex06번_79079 {
	
	public static void main(String[] args) {

		int sum = 0;

		for(int i = 77, j =1 ; i>0; i--, j++) {
			
			sum += i*j;
			System.out.print("(" + i + "*" + j + ")" + "+");
			
		}
		
		System.out.println();
		System.out.println(sum);

			

		}

}


