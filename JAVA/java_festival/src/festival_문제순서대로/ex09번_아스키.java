package festival_문제순서대로;

public class ex09번_아스키 {

	public static void main(String[] args) {

		for (char c = 65; c <= 90; c++)

			System.out.format("%3d | 0x%02X | %c%n", (int)c, (int) c, c);

	}

}
