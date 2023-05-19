package java_festival_메소드;

public class ex02_가운데글자 {

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));

	}

	private static String getMiddle(String word) {
		
		String[] arr = word.split("");
		int len = arr.length;
		
		if(len %2 == 0) {
			return arr[len/2-1] + arr[len/2];
		}
		else {
			return arr[len/2];
		}
		
		
	}

}
