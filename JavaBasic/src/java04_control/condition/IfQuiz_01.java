package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		if (input < 0) {
			System.out.println("�����Դϴ�");
		}
		if (input > 0) { 
			System.out.println("����Դϴ�");
		}
		if (input == 0) {
			System.out.println("0�Դϴ�");
		}
	}
}

