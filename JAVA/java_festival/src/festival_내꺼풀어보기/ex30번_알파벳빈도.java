package festival_내꺼풀어보기;

import java.util.Scanner;

public class ex30번_알파벳빈도 {

	public static void main(String[] args) {

		int cnt[] = new int[26];

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String str;
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			cnt[ch - 'a']++;

		}

		for (int i = 0; i < 26; i++) {
			System.out.println((char) (97 + i) + ":" + cnt[i]);

		}
	}

}