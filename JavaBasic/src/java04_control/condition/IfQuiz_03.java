package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); //입력 객체
		//--------------------------------------------------
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
	
		if (num1 > num2) {// num1이 큰 경우
			System.out.println(num1 + "이/가 큽니다");
		}
		if (num1 < num2 ) { //num2이 큰 경우
			System.out.println(num2 + "이/가 큽니다");
		}
		if (num1 == num2 ) { //같은 경우
			System.out.println("두 숫자가 " + num1 +"(으)로 같습니다");
		}
	}
}

