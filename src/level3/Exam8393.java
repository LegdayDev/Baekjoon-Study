package level3;

import java.util.Scanner;

public class Exam8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int inputData = sc.nextInt();
		
		for(int i=1;i<=inputData;i++) {
			total+=i;
		}
		System.out.println(total);
	}

}
