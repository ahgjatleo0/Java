package 이중for문;

public class ex03_별찍기_피라미드 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			
			for(int j = 1; j<= 7-i; j++) {
				//공백반복
				System.out.print(" ");
			}
			
			for(int k =1; k <= i*2-1; k++) {
				//별반복
				System.out.print("*");
			}

			System.out.println();
		}


	}
}

//   *   
//  ***    
// *****  
//*******