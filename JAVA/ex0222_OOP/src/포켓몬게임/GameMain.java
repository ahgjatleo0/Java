package 포켓몬게임;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 실행하는 공간

		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 2500, 250);
		Pokemon kkobuk = new Pokemon("꼬부기", "물", "물대포", 1000, 150);

		while (true) {

			System.out.println("\n==포켓몬을 선택하세요==");
			System.out.print("[1]피카츄 [2]꼬부기 >> ");
			int choice = sc.nextInt();

//-------------------------------피카츄선택----------------------------------------

			if (choice == 1) {
				// 사용자가 피카츄를 선택
				// 피카츄가 꼬부기 공격
				System.out.println("\n==공격을 선택하세요==");
				System.out.print("[1]일반공격 [2]스킬 >> ");
				int choiceAtk = sc.nextInt();

				if (choiceAtk == 1) {

					kkobuk.setHp(kkobuk.getHp() - pika.getAtk());
					System.out.println("꼬부기가 공격에 맞았습니다" + "  -" + pika.getAtk());
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "  피카츄 HP : " + pika.getHp());

				} else if (choiceAtk == 2) {

					double skillatk = pika.getAtk() * 1.5;
					System.out.println(pika.getName() + " " + pika.getSkill());
					kkobuk.setHp(kkobuk.getHp() - (int) skillatk);
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "  피카츄 HP : " + pika.getHp());

				}

//---------------------------------꼬부기 선택-------------------------------------

			} else if (choice == 2) {

				System.out.println("\n==공격을 선택하세요==");
				System.out.print("[1]일반공격 [2]스킬 >> ");
				int choiceAtk = sc.nextInt();

				if (choiceAtk == 1) {

					pika.setHp(pika.getHp() - kkobuk.getAtk());
					System.out.println("피카츄가 공격에 맞았습니다" + "  -" + kkobuk.getAtk());
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "  피카츄 HP : " + pika.getHp());

				} else if (choiceAtk == 2) {

					double skillatk = kkobuk.getAtk() * 1.5;
					System.out.println(kkobuk.getName() + " " + kkobuk.getSkill());
					pika.setHp(pika.getHp() - (int) skillatk);
					System.out.println("꼬부기 HP : " + kkobuk.getHp() + "  피카츄 HP : " + pika.getHp());

				} else {
					System.out.println("잘못된 숫자를 입력하셨습니다.ㅠㅠ");
				}

			}

// --------------------------종료조건---------------------------

			if (kkobuk.getHp() <= 0 || pika.getHp() <= 0) {

				if (kkobuk.getHp() == 0) {
					System.out.println("승자는 " + pika.getName());
				} else {
					System.out.println("승자는 " + kkobuk.getName());

				}

				System.out.println("게임을 종료합니다");
				break;
			}
		}

	}

}
