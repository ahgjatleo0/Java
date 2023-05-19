package 복합예제;

import java.util.Scanner;

public class ex01_자판기프로그램switch {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int cash = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.(500원) >> ");
		int menu = sc.nextInt();
		int result = 0;
		int a = 700;
		int b = 1000;
		int c = 500;
		
		if (cash < a || cash < b || cash < c) {
			System.out.println("돈이 부족해요 ㅠㅠ");
			System.out.println("잔돈 : " + cash);
		
		}else {			
			switch (menu) {
			case 1:  
				result = cash -a;
				break;	
			case 2: 
				result = cash -b;
				break;
			default:
				result = cash -c;
				
				break;
	
			}

			System.out.println("잔돈 : " + result + "원");
		}
		

			
	}

}
