package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	
	// 삼각형 넓이 구하이
	// 삼각형 넓이 = ( 밑변 * 높이) /2
	// 밑변과 높이를 입력받아 계산
	
	// 1. 필요한 변수 선언 (+ 데이터타입 생각)
	
	
	// 2. 데이터 입력
	// 3. 문제에 주어진 계산 수행
	// 4. 결과 출력
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("밑변을 입력하세요");
//		String str = sc.nextLine();
//		int bottom = 10;
//		
//		System.out.print("높이를 입력하세요");
//		int height = 10;
//		height = sc.nextInt();
//		
//		
//		System.out.print("높이를 입력하세요");
//		int height1 = 10;
//		height = sc.nextInt();
//		
//		
//		
//		System.out.println("삼각형 넓이 : " + (bottom * height)/2);  // 내가 만든 코드
		
		
		//1.
		int base ; //밑변
		int height; //높이
		double area; //넓이
		
		//2.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변은? ");
		base = sc.nextInt();
		
		System.out.print("높이는? ");
		height = sc.nextInt();
		
		//3.
		area = (base * height) / (double)2;
		
		//4.
		System.out.println();
		System.out.println("넓이 : " + area);
	}

}
