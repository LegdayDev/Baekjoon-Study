package level2;

import java.util.Scanner;
public class Exam2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		if(h==0) {
			if((m-45)<0) {
				m-=45;
				m= 60+m;
				h=23;
			}
			else{
				m-=45;
			}
		}
		else {
			if((m-45)<0) {
				m-=45;
				m= 60+m;
				h--;
			}
			else{
				m-=45;
			}
		}
		System.out.println(h + " " + m);
	}
}
