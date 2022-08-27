package level2;

import java.util.Scanner;

public class Exam9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int userScore = sc.nextInt();
		
		switch(userScore/10) {
		case 10: //똑같은 결과값을 반환하는 조건은 이렇게 중첩으로 사용 가능
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
