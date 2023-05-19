package festival_문제순서대로;

import java.util.Scanner;

public class ex15번_하나씩더하기 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0 , j = 1; i<n; i++) {
			
			j += i;
			System.out.print(j + " ");
			
		
			
		}
		
		
		
		
		
	}

}


