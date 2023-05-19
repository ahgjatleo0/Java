package 산술연산자;

import java.util.Scanner;

public class homework {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("초 입력 : ");
			int totalSecond = sc.nextInt();
			int x = 60*60;
			int h = totalSecond /x;
			int m = (totalSecond %x)/60;
			int s = (totalSecond %x)%60;
			System.out.println(h+"시"+m+"분"+s+"초");
		
		}
		
		
		
	}


