package festival_문제순서대로;

import java.util.Scanner;

public class ex01번_몸무게 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int present = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int now = 0;
		int i = 0;
		
		while(true) {
			
			System.out.print((i+1) + "주차 감량몸무게 : ");
			i++;
			now = sc.nextInt();
			present -= now ;
			
	
			
			if (present<=goal) {
				System.out.print(present + "kg 달성!! 축하합니다!");
				break;
			}
			
		}
				

	
		
		
		
		
		
		
	}

}
