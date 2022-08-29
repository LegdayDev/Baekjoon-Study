package level3;

import java.util.Scanner;

public class Exam25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int receiptMoney = sc.nextInt();
		int totalMoney =0;
		int typeNum = sc.nextInt();
		
		for(int i=0;i<typeNum;i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			totalMoney+=(price*num);
		}
		sc.close();
		if(totalMoney==receiptMoney) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
