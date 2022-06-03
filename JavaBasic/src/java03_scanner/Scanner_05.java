package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {
	public static void main(String[] args) {
		
		//Scanner를 이용한 char입력받기
		//Scanner에서 char타입을 입력받는 기능이 없다
		
		//String은 char형을 모아놓은 데이터타입이다.
		
		//String으로 입력받고, 첫 글자를 char타입으로 변환한다
		//-------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); // 입력 객체
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		System.out.println("[TEST] str : " + str);
		
		//str문자열의 0번째 인덱스 값을 char형 변수alpha에 저장한다
		char alpha = str.charAt(0);
		System.out.println("[TEST] alpha : " + alpha);
	}

}
