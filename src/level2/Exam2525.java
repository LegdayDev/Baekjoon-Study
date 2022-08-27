package level2;

import java.util.Scanner;

public class Exam2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int inputData = sc.nextInt();
		
		m+=inputData;
		
		h+=m/60;
		if(h>=24)
			h-=24;
		m=m%60;
		
		System.out.println(h +" "+m);

	}

}
