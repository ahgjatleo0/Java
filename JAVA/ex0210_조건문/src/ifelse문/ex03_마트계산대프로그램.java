package ifelse문;

import java.util.Scanner;

public class ex03_마트계산대프로그램 {
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int a = sc.nextInt();
		int result = 10000*a;
	
		if (a>=11) {
			
			System.out.println("가격은" + (int)(result-result*0.1)+"원입니다.");
		}
		else {
			System.out.println("가격은" + (int)(result) +"원입니다.");
		}
		
		
		
		
		
		
	}
	
	

}
