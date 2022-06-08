package forQuiz;

import java.util.Scanner;

public class ForQuiz_03 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1~1000까지의 정수를 입력하세요 : ");
		
		
		for(int num =1; num<=1000; num++) {
			if(num%4 ==1 && num%6 ==1) {
				sum += num;
			}
		}
		
		System.out.println(sum);

	}
}
