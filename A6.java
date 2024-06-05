//6.주사위 페어 프로그램
//2명이 10번 승부를 했을 때, 이긴 경우와 무승부는 각각 몇번씩 나오는지

//1) 주사위 굴리는 횟수 지정하고
//2) 이긴 경우 / 무승부 변수를 만들기

import java.util.Random;

public class A6 {
	public static void main(String[] args) {
		Random r = new Random(); // seed: 지정한 고정값 출력 

		// 첫 번째 주사위 값
		int num1 = r.nextInt(6) + 1; // Int(6)은 0~5 숫자. 1을 추가해 1~6 범위를 만듬
		int num2 = r.nextInt(6) + 1;
		int sum1 = num1 + num2;

		// 두 번째 주사위 값
		int num3 = r.nextInt(6) + 1;
		int num4 = r.nextInt(6) + 1;
		int sum2 = num3 + num4;
	
		// 결과 출력
		System.out.printf("플레이어1: %d, %d. 합계: %d\n", num1, num2, sum1);
		System.out.printf("플레이어2: %d, %d. 합계: %d\n", num3, num4, sum2);

		// 흐름이 위>아래로 흘러가기에 값이 필요한 시점에 해당 부분을 넣기.
		boolean player1 = (num1 == num2); // 주사위 2개의 값이 같을 때 참
		boolean player2 = (num3 == num4); // 주사위 2개의 값이 같을 때 참
		
		// 승자 결정
		if (sum1 > sum2) {
			System.out.println("승자는 플레이어1");
		} else if (sum1 < sum2) {
			System.out.println("승자는 플레이어2");
		} else {
			// 합계가 같은 경우 페어 여부로 승자 결정
			if (player1 && !player2) { // 1값이 참이고 2가 거짓일 때 승자는 1
				System.out.println("승자는 플레이어1");
			} else if (!player1 && player2) {
				System.out.println("승자는 플레이어 2");
			} else {
				System.out.println("무승부");
			}
		}
	}
}
