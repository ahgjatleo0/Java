package java_festival_반복문;

import java.util.Scanner;

public class ex01_보너스1번 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
	
		while(true) {
			
			System.out.print("A 입력 >> " );
			x = sc.nextInt();
			System.out.print("B 입력 >> ");
			y = sc.nextInt();

			
			if (x==0 && y ==0) {
				break;
				
			}
				
			System.out.println("결과 >> " + (x-y));
			
		}
		
		
		
		
		
	}
	
	
	
	

}
