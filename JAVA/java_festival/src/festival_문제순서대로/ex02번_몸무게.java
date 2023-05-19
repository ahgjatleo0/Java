package festival_문제순서대로;

import java.util.Scanner;

public class ex02번_몸무게 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int price = time*5000;
		int plusTime = time -8;
		
		if(time >8 ) {
			int plus = 8*5000 + plusTime*7500;
			System.out.println("총 임금은 " + plus +"원 입니다.");
			 
			
		}else {
			System.out.println("총 임금은 " + price +"원 입니다.");
			
			
		}
		
		
		
		
	}

}
