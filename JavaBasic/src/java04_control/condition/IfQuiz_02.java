package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3의 배수 숫자 하나 입력받기
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		if (input%3 != 0) {
			System.out.println("3의 배수가 아닙니다");
		}
		if (input%3 == 0) {
			System.out.println("3의 배수입니다");
		}
		
		// if(num%3 == 0 && num!= 0 ) { //3의 배수
		//System.out.println("num["+num+"]은/는 3의 배수이다");
		//}
		// if (num%3 !=0 || num==0 {// 3의 배수가 아님
		//System.out.println("num["+num+"]은/는 3의 배수가 아니다");
		//}
	}

	}
