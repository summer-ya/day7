package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		// 입력 객체
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----입력----");
		
		System.out.println("Input Number: ");
		int num = sc.nextInt(); //정수값 입력받기
		
		System.out.println("Input String: ");
		int str = sc.nextInt(); //문자열 입력받기
		
		System.out.println("----출력----");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
	}

}
