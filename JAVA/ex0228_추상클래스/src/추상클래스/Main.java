package 추상클래스;

public class Main {

	public static void main(String[] args) {

		RegularEmployee regu = new RegularEmployee("SMHRD001", "홍O동", 4000, 300);
		System.out.println(regu.print());

		TempEmployee temp = new TempEmployee("SMHRD002", "박O수", 3000);
		System.out.println(temp.print());

		PartTimeEmployee emp = new PartTimeEmployee("SMHRD003", "임성훈", 10, 20);
		System.out.println(emp.print());

	}

}
