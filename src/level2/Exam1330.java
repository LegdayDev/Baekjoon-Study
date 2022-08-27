package level2;

import java.util.Scanner;

public class Exam1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}
		else if(a<b) {
			System.out.println("<");
		}
		else { //else if(a==b) 를 써도 상관없다. 
			System.out.println("==");
		}
	}
}
