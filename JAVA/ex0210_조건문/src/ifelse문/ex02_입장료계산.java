package ifelse문;

import java.util.Scanner;

public class ex02_입장료계산 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int b = sc.nextInt();
		int c = 5000;
		int result = c*b;
		
		if (a<20) {
			
			System.out.println("총" + (int)(result * 0.5) +"원입니다.");
		}
		else {
			System.out.println("총" + (int)(result) +"원입니다.");
		}
		
		
		
		
		
	}
	
	

}
