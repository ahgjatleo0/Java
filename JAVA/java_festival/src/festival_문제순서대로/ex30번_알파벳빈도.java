package festival_문제순서대로;

import java.util.Scanner;

public class ex30번_알파벳빈도{

   public static void main(String[] args) {

      // 알파벳의 갯수만큼 배열의 공간 만들기
      int cnt[] = new int[26];

      // cnt[0] -> a의 갯수를 담을 수 있는 공간
      // cnt[1] -> b의 갯수를 담을 수 있는 공간

      Scanner sc = new Scanner(System.in);
      System.out.println("==== 알파벳 빈도수 구하기 ====");

      System.out.print("입력 >> ");

      // nextLint() : 공백을 포함한 한 문장을 인지할 수 있는 메소드
      String str = sc.nextLine();

      // "abcd"
      for (int i = 0; i < str.length(); i++) {

         // String -> char == 65
         char ch = str.charAt(i); // "a" -> 'a'

         // ch가 대문자('A' ~ 'Z')인지 소문자('a' ~ 'z')인지 판단
         // ex) 'A' -> 100
         // ex) 'B' -> 101
         if (ch >= 'A' && ch <= 'Z') {
            // 대문자에 해당하는 사용
            // 'A' -> cnt[0]

            // cnt[0]++; -> a
            // cnt[1]++; -> b
            cnt[ch - 'A']++;

         } else if (ch >= 'a' && ch <= 'a') {
            // 소문자에 해당하는 내용
            // 'a' -> cnt[0]
            cnt[ch - 'a']++;
         }

      }
      for (int i = 0; i < 26; i++) {

         System.out.println((char) (97 + i) + " : " + cnt[i]);

      }

   }

}