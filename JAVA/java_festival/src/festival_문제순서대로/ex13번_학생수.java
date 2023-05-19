package festival_문제순서대로;

public class ex13번_학생수 {

	public static void main(String[] args) {

		char[] arr = { 'A', 'A', 'B', 'C', 'D', 'A', 'C', 'D', 'D', 'D', 'F' };
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'A') {
				a++;
			} 
			else if (arr[i] == 'B') {
				b++;
			}
			else if (arr[i] == 'C') {
				c++;
			}
			else if (arr[i] == 'D') {
				d++;
			}
			else if (arr[i] == 'F') {
				f++;
			}

		}
		System.out.println("A : " +a+ "명");
		System.out.println("B : " +b+ "명");
		System.out.println("C : " +c+ "명");
		System.out.println("D : " +d+ "명");
		System.out.println("F : " +f+ "명");

	}

}
