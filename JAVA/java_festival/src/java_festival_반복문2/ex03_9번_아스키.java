package java_festival_반복문2;

public class ex03_9번_아스키 {

	public static void main(String[] args) {

		for (char c = 65; c <= 90; c++)

			System.out.format("%3d | 0x%02X | %c%n", (int)c, (int) c, c);

	}

}
