package level3;

import java.util.Scanner;

public class Exam2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(line + " * " + i +" = "+(line*i));
		}
	}
}
