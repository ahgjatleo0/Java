package 복합예제;

import java.util.Iterator;
import java.util.Scanner;

public class ex01_자판기프로그램 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int cash = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.(500원) >> ");
		int menu = sc.nextInt();
		int result = 0;
		
	
		if (menu == 1 && cash >=700) {

			result = cash -700;	

		}
		else if (menu == 2 && cash >=1000) {			
			result = cash -1000;
			
		}
		else if(menu == 3 && cash >=500){
			result = cash -500;	

		}
		int x = result/1000;
		int y = (result% 1000)/500;
		int z = (result% 1000)%500/100;
		
		if (result >= 0) {
			System.out.println("잔돈 : " + result + "원");			
			System.out.println("천원 : " +x+ "개," + "오백원 : " +y+ "개," + "백원 : "+z+"개,");
				
		}else {
			System.out.println("돈이 부족해요 ㅠㅠ");
			System.out.println("잔돈 : " + cash);
			System.out.println("천원 : " +x+ "개," + "오백원 : " +y+ "개," + "백원 : "+z+"개");
		



		
	}
	}
}
	


