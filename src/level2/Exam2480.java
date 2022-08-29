package level2;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int sameData=0;
		int []arrDice = new int[3];
		
		for(int i=0;i<arrDice.length;i++) {
			arrDice[i]=sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arrDice); //오름차순으로 정렬
		
		for(int i=0;i<arrDice.length;i++) {
			if(i==arrDice.length-1) break; //마지막인덱스일때 마지막인덱스+1 을 하면 범위초과하기 때문에 break
			if(arrDice[i]==arrDice[i+1]) {
				count++;
				sameData=arrDice[i];
			}
		}
		if(count==2) {
			int result = 10000;
			result+=(sameData*1000);
			System.out.println(result);
		}
		else if(count==1) {
			int result = 1000;
			result+=(sameData*100);
			System.out.println(result);
		}
		else {
			int result = (arrDice[2]*100);
			System.out.println(result);
		}
		
		
	}

}
