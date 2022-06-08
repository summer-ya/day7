package forQuiz;

import java.util.Scanner;

public class ForQuiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		int input = sc.nextInt();
		
		
			for(int j = 1; j<=9; j++) {
				System.out.println(input + " x " + j + " = " + input*j);
			}
	}

}
