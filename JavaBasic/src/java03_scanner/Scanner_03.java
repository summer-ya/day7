package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {
	public static void main(String[] args) {
		
		//문자열 입력 처리 메소드(기능)
		// nextLine(), next()
		//-------------------------------------
		
		//키보드 입력 객체
		Scanner sc = new Scanner(System.in);
		
		//문자열 변수
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//문자열 입력 받기
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		//str1 = sc.next();
		//str2 = sc.next();
		
		System.out.print("-----출력 -----");
		System.out.println("str1 : " + str1);
		System.out.print("str2 : " + str2);
		
		//nextLine() - '\n'
		//개행문자(엔터값)를 기준으로 입력한 한 줄을 하나의 문자열로 판단한다
		
		//next() - ' ', '\n', '\t'
		//공백문자(white space, ws)를 기준으로 하나의 문자열로 판단한다

	}
	
	
}
