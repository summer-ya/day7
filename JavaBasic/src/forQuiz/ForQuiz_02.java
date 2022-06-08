package forQuiz;

import java.util.Scanner;

public class ForQuiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i>0; i++) {
			if(num%i == 0) {
				System.out.print(i);
			}
		}
	}

}
