package 닌텐도게임;

public class GameMain {
	// 닌텐도 게임기(실행할 수 있는 공간)

	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성이 불가능하다.
		Dongmul d = new Dongmul();
		on(d);
		
		
		
		// 마리오 게임칩 꺼내오기
		GameChip m = new Mario();
		// 게임칩을 넣기
		on(m);
		// 젤다 게임칩 꺼내오기
		GameChip z = new Zelda();
		// 게임칩을 넣기
		on(z);
		// PokemonGo 게임칩 꺼내오기
		GameChip p = new PokemonGo();
		// 게임칩을 넣기
		on(p);

	}

	// 게임칩을 넣어서 작동시키는 메소드
	private static void on(GameChip m) {

		m.gameStart();

	}

	/* 메소드 오버로딩 기법으로 풀어내는 방법
	 --> 매우 비효율적
	private static void on(Mario m) {

		m.gameStart();

	}
	private static void on(Zelda z) {
		
		z.gameStart();
		
	}
	private static void on(Pokemon P) {
		
		p.gameStart();
		
	}
	*/

}
